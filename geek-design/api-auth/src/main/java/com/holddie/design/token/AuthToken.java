package com.holddie.design.token;

import com.holddie.design.utils.MD5Util;

import java.time.Duration;
import java.time.Instant;
import java.util.Objects;

public class AuthToken {

  public static final long DEFAULT_TIME_INTERVAL = 1 * 60 * 1000;
  private String token;
  private long createTime;
  private long expiredTimeInterval = DEFAULT_TIME_INTERVAL;

  public AuthToken(String token, long createTime) {
    this.token = token;
    this.createTime = createTime;
  }

  public static AuthToken generate(String originalUrl, String appId, String password, long timestamp) {
    String token = MD5Util.md5(originalUrl + appId + password + timestamp);
    return new AuthToken(token, timestamp);
  }

  public boolean isExpired() {
    Instant expiredTime = Instant.ofEpochMilli(createTime).plusMillis(expiredTimeInterval);
    if (Duration.between(Instant.now(), expiredTime).isNegative()) {
      return false;
    }
    return true;
  }

  public boolean notMatch(AuthToken clientAuthToken) {
    return Objects.equals(token, clientAuthToken.getToken());
  }

  public String getToken() {
    return token;
  }
}
