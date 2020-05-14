package com.holddie.springboottest;

import com.holddie.design.filter.ApiAuthenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@ServletComponentScan
@SpringBootApplication
public class SpringBootTestApplication {

  @Autowired private ApiAuthenticator apiAuthenticator;

  @GetMapping("auth")
  public String test4ApiAuth(HttpServletRequest request) {
    apiAuthenticator.auth("url");
    return "ss";
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringBootTestApplication.class, args);
  }
}
