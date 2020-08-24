package com.holddie.design;

import com.holddie.design.factory.ReporterFactory;
import com.holddie.design.reporter.ConsoleReporter;
import com.holddie.design.storage.MetricsStorage;
import com.holddie.design.storage.MockRedisMetricsStorage;
import com.holddie.design.viewer.ConsoleViewer;
import org.junit.jupiter.api.Test;

public class Demo {

  public static void main(String[] args) {
    MetricsStorage storage = new MockRedisMetricsStorage();
    ConsoleReporter consoleReporter = ReporterFactory.createConsoleReporter(storage);
    consoleReporter.startRepeatedReport(2, 2);

//    EmailReporter emailReporter = new EmailReporter(storage);
//    emailReporter.addToAddress("wangzheng@xzg.com");
//    emailReporter.startDailyReport();

    MetricsCollector collector = new MetricsCollector(storage);
    collector.recordRequest(new RequestInfo("register", 123, 10234));
    collector.recordRequest(new RequestInfo("register", 223, 11234));
    collector.recordRequest(new RequestInfo("register", 323, 12334));
    collector.recordRequest(new RequestInfo("login", 23, 12434));
    collector.recordRequest(new RequestInfo("login", 1223, 14234));

//    try {
//      Thread.sleep(1000);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
  }

  @Test
  public void testConsoleReporter() {
    MetricsStorage storage = new MockRedisMetricsStorage();
    Aggregator aggregator = new Aggregator();
    ConsoleReporter consoleReporter = new ConsoleReporter(storage, aggregator, new ConsoleViewer());
    consoleReporter.startRepeatedReport(2, 2);
    MetricsCollector collector = new MetricsCollector(storage);
    collector.recordRequest(new RequestInfo("register", 123, 10234));
    collector.recordRequest(new RequestInfo("register", 223, 11234));
    collector.recordRequest(new RequestInfo("register", 323, 12334));
    collector.recordRequest(new RequestInfo("login", 23, 12434));
    collector.recordRequest(new RequestInfo("login", 1223, 14234));
  }

  @Test
  public void testEmailReporter() {
    MetricsStorage storage = new MockRedisMetricsStorage();
    Aggregator aggregator = new Aggregator();
    ConsoleReporter consoleReporter = new ConsoleReporter(storage, aggregator, new ConsoleViewer());
    consoleReporter.startRepeatedReport(2, 2);
    MetricsCollector collector = new MetricsCollector(storage);
    collector.recordRequest(new RequestInfo("register", 123, 10234));
    collector.recordRequest(new RequestInfo("register", 223, 11234));
    collector.recordRequest(new RequestInfo("register", 323, 12334));
    collector.recordRequest(new RequestInfo("login", 23, 12434));
    collector.recordRequest(new RequestInfo("login", 1223, 14234));
  }
}
