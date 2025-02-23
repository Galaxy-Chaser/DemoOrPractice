package org.example.jwt_demo.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(urlPatterns = "/*")//可以选择拦截的路径
public class FilterDemo implements Filter {

    //创建和销毁有默认方法，无需自己实现
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        //放行前逻辑 比如校验令牌

        filterChain.doFilter(servletRequest, servletResponse);

        //放行后逻辑
    }

}
