package com.holddie.design.factory;

import com.holddie.design.Aggregator;
import com.holddie.design.reporter.ConsoleReporter;
import com.holddie.design.storage.MetricsStorage;
import com.holddie.design.viewer.ConsoleViewer;

public class ReporterFactory {
  public static ConsoleReporter createConsoleReporter(MetricsStorage storage) {
    Aggregator aggregator = new Aggregator();
    return new ConsoleReporter(storage, aggregator, new ConsoleViewer());
  }
}
