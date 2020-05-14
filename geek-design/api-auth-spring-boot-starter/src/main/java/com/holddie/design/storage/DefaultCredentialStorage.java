package com.holddie.design.storage;

import com.holddie.design.config.ApiAuthProperties;

public class DefaultCredentialStorage implements CredentialStorage {

	public DefaultCredentialStorage(ApiAuthProperties apiAuthProperties) {
		this.apiAuthProperties = apiAuthProperties;
	}

	private ApiAuthProperties apiAuthProperties;


	@Override
	public String getPasswordById(String appId) {
		return apiAuthProperties.findPasswordByAppId(appId);
	}
}
