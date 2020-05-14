package com.holddie.springboottest;

import com.holddie.design.filter.ApiAuthenticator;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = {"/"})
public class ApiAuthFilter implements Filter {

	@Autowired
	private ApiAuthenticator apiAuthenticator;

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		apiAuthenticator.auth(servletRequest.getRemoteAddr());
		filterChain.doFilter(servletRequest, servletResponse);
	}
}
