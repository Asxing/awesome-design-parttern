package com.holddie.design.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Objects;

@ConfigurationProperties(prefix = "api.auth")
public class ApiAuthProperties {
    private static final String DEFAULT_SPLIT = ":";

    private List<String> authAccounts;

    public List<String> getAuthAccounts() {
        return authAccounts;
    }

    public String findPasswordByAppId(String appId) {
        String password = null;
        for (String s : this.getAuthAccounts()) {
            if (s.contains(appId) && s.contains(DEFAULT_SPLIT)) {
                String[] split = s.split(DEFAULT_SPLIT);
                if (Objects.equals(split[0], appId) && split.length > 1) {
                    password = split[1];
                }
            }
        }
        return password;
    }

    public void setAuthAccounts(List<String> authAccounts) {
        this.authAccounts = authAccounts;
    }
}
