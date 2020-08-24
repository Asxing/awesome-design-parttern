package com.holddie.design.storage;

import com.holddie.design.RequestInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockRedisMetricsStorage implements MetricsStorage {


	Map<String, List<RequestInfo>> map = new HashMap<>();

	//...省略属性和构造函数等...
	@Override
	public void saveRequestInfo(RequestInfo requestInfo) {

		if (map.containsKey(requestInfo.getApiName())) {
			map.get(requestInfo.getApiName()).add(requestInfo);
		} else {
			map.put(requestInfo.getApiName(), new ArrayList<RequestInfo>());
			map.get(requestInfo.getApiName()).add(requestInfo);
		}
		System.out.println("saveRequestInfo");
	}

	@Override
	public List<RequestInfo> getRequestInfos(String apiName, long startTimestamp, long endTimestamp) {
		//...
		System.out.println("getRequestInfos");
		return map.get(apiName);
	}

	@Override
	public Map<String, List<RequestInfo>> getRequestInfos(long startTimestamp, long endTimestamp) {
		//...
		System.out.println("getRequestInfos");
		return map;
	}
}
