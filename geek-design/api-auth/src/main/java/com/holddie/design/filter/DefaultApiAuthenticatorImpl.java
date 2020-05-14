package com.holddie.design.filter;

import com.holddie.design.request.ApiRequest;
import com.holddie.design.storage.CredentialStorage;
import com.holddie.design.storage.DefaultCredentialStorage;
import com.holddie.design.token.AuthToken;

import java.util.Objects;

/**
 * handle api auth
 *
 * @author Thomas Yang
 * @version 1.0
 * @date 2020/5/14 3:07 PM
 */
public class DefaultApiAuthenticatorImpl implements ApiAuthenticator {

	private CredentialStorage credentialStorage;

	public DefaultApiAuthenticatorImpl(CredentialStorage credentialStorage) {
		this.credentialStorage = credentialStorage;
	}

	@Override
	public void auth(String url) {
		System.out.println("url: " + url);
		ApiRequest apiRequest = ApiRequest.buildFormUrl(url);
		auth(apiRequest);
	}

	@Override
	public void auth(ApiRequest apiRequest) {
		String originalUrl = apiRequest.getOriginalUrl();
		String appId = apiRequest.getAppId();
		String token = apiRequest.getToken();
		long timestamp = apiRequest.getTimestamp();
		AuthToken clientAuthToken = new AuthToken(token, timestamp);

		if (clientAuthToken.isExpired()) {
			throw new RuntimeException("Token is expired");
		}

		String password = credentialStorage.getPasswordById(appId);
		AuthToken serverAuthToken = AuthToken.generate(originalUrl, appId, password, timestamp);
		if (serverAuthToken.notMatch(clientAuthToken)) {
			throw new RuntimeException("Token verification fail");
		}
	}
}
