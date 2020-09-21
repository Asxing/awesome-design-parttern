package com.holddie.design.flyweight.java;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegerCacheTest {

  @Data
  @AllArgsConstructor
  class BigImage {
    String name;
  }

  @Data
  @AllArgsConstructor
  class UniqueImageName {
    String name;
  }

  @Test
  public void testWeakHashMap() {
    WeakHashMap<UniqueImageName, BigImage> map = new WeakHashMap<>();
    BigImage bigImageFirst = new BigImage("foo");
    UniqueImageName imageNameFirst = new UniqueImageName("name_of_big_image");
    map.put(imageNameFirst, bigImageFirst);

    BigImage bigImageSecond = new BigImage("foo_2");
    UniqueImageName imageNameSecond = new UniqueImageName("name_of_big_image_2");
    map.put(imageNameSecond, bigImageSecond);

    assertTrue(map.containsKey(imageNameFirst));
    assertTrue(map.containsKey(imageNameSecond));

    imageNameFirst = null;
    System.gc();
    await().atMost(10, TimeUnit.SECONDS).until(() -> map.size() == 1);

    await().atMost(10, TimeUnit.SECONDS).until(() -> map.containsKey(imageNameSecond));
  }
}
