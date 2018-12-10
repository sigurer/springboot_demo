package com.example.springboot_demo.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter
public class TestFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        logger.trace("日志输出 trace");
//        logger.debug("日志输出 debug");
        logger.info("TestFilter: init");
//        logger.warn("日志输出 warn");
//        logger.error("日志输出 error");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("TestFilter doFilter: before");
        filterChain.doFilter(servletRequest,servletResponse);
        logger.info("TestFilter doFilter: after");
    }

    @Override
    public void destroy() {
        logger.info("TestFilter: destroy");
    }
}
