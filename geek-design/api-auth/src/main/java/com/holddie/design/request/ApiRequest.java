package com.holddie.design.request;

import com.holddie.design.utils.UrlUtil;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.Objects;

public class ApiRequest {


	private String originalUrl;
	private String token;
	private String appId;
	private long timestamp;

	public ApiRequest(String originalUrl, String token, String appId, long timestamp) {
		this.originalUrl = originalUrl;
		this.token = token;
		this.appId = appId;
		this.timestamp = timestamp;
	}

	public static ApiRequest buildFormUrl(String url) {
		UrlUtil.UrlEntity urlEntity = UrlUtil.parse(url);
		Map<String, String> params = urlEntity.getParams();
		if (Objects.isNull(params)) {
			throw new RuntimeException("Missing parameters");
		}
		String timestamp = params.get("timestamp");
		long createTime;
		if (StringUtils.isEmpty(timestamp)) {
			createTime = 0L;
		} else {
			createTime = Long.parseLong(timestamp);
		}
		return new ApiRequest(urlEntity.getBaseUrl(), params.get("token"), params.get("appId"), createTime);
	}

	public String getOriginalUrl() {
		return originalUrl;
	}

	public String getToken() {
		return token;
	}

	public String getAppId() {
		return appId;
	}

	public long getTimestamp() {
		return timestamp;
	}
}
