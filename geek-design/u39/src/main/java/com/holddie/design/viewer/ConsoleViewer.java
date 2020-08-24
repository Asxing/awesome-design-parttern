package com.holddie.design.viewer;

import com.google.gson.Gson;
import com.holddie.design.RequestStat;

import java.util.Map;

public class ConsoleViewer implements StatViewer {

  @Override
  public void output(Map<String, RequestStat> requestStats, long startTimeInMillis,
                     long endTimeInMillis) {
    System.out.println("Time Span: [" + startTimeInMillis + ", " + endTimeInMillis + "]");
    Gson gson = new Gson();
    System.out.println(gson.toJson(requestStats));
  }
}
