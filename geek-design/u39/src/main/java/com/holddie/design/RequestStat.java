package com.holddie.design;

import lombok.Data;

@Data
public class RequestStat {

	private double maxResponseTime;
	private double minResponseTime;
	private double avgResponseTime;
	private double p999ResponseTime;
	private double p99ResponseTime;
	private long count;
	private long tps;

	public RequestStat() {
	}

	public RequestStat(double maxResponseTime, double minResponseTime, double avgResponseTime,
	                   double p999ResponseTime, double p99ResponseTime, long count, long tps) {
		this.maxResponseTime = maxResponseTime;
		this.minResponseTime = minResponseTime;
		this.avgResponseTime = avgResponseTime;
		this.p999ResponseTime = p999ResponseTime;
		this.p99ResponseTime = p99ResponseTime;
		this.count = count;
		this.tps = tps;
	}
}
