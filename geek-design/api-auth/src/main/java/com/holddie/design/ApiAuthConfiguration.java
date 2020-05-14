package com.holddie.design;

import com.holddie.design.config.ApiAuthProperties;
import com.holddie.design.filter.ApiAuthenticator;
import com.holddie.design.filter.DefaultApiAuthenticatorImpl;
import com.holddie.design.storage.CredentialStorage;
import com.holddie.design.storage.DefaultCredentialStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ApiAuthProperties.class)
@ConditionalOnClass(ApiAuthenticator.class)
@ConditionalOnProperty(prefix = "api.auth", value = "enabled", matchIfMissing = true)
public class ApiAuthConfiguration {
  @Autowired private ApiAuthProperties apiAuthProperties;

  @Bean
  @ConditionalOnMissingBean(ApiAuthenticator.class)
  public ApiAuthenticator customerService() {
    CredentialStorage credentialStorage = new DefaultCredentialStorage(apiAuthProperties);
    return new DefaultApiAuthenticatorImpl(credentialStorage);
  }
}
