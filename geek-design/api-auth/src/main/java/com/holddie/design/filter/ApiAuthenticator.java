package com.holddie.design.filter;

import com.holddie.design.request.ApiRequest;

public interface ApiAuthenticator {
	/**
	 * auth by URL
	 *
	 * @param url request url
	 * @date 2020/5/14  2:57 PM
	 * @author Thomas Yang
	 */
	void auth(String url);

	/**
	 * auth by {@link ApiRequest}
	 *
	 * @param apiRequest auth object
	 * @date 2020/5/14  2:58 PM
	 * @author Thomas Yang
	 */
	void auth(ApiRequest apiRequest);
}
