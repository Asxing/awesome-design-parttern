package com.holddie.design.viewer;

import com.holddie.design.RequestStat;

import java.util.Map;

public interface StatViewer {

	void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills);
}
