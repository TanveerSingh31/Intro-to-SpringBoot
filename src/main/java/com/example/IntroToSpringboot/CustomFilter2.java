package com.example.IntroToSpringboot;


import jakarta.servlet.*;

import java.io.IOException;

public class CustomFilter2 implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("start of filter - 2");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("end of filter - 2");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
