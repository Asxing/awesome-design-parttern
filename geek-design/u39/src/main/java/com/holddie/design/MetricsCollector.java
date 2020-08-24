package com.holddie.design;

import com.holddie.design.storage.MetricsStorage;

public class MetricsCollector {
  /*
  基于接口而非实现编程
   */
  private MetricsStorage metricsStorage;

  /**
   * 依赖注入
   *
   * @date 2020/8/24 7:54 PM
   * @author Thomas Yang
   * @version 1.0
   */
  public MetricsCollector(MetricsStorage metricsStorage) {
    this.metricsStorage = metricsStorage;
  }

  /**
   * 用一个函数代替了最小原型中的两个函数
   *
   * @date 2020/8/24 7:55 PM
   * @author Thomas Yang
   * @version 1.0
   */
  public void recordRequest(RequestInfo requestInfo) {
    if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
      return;
    }
    metricsStorage.saveRequestInfo(requestInfo);
  }
}
