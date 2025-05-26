package com.example.IntroToSpringboot;


import jakarta.servlet.*;

import java.io.IOException;

public class CustomFilter1 implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("start of filter1");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("end of filter1");

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
