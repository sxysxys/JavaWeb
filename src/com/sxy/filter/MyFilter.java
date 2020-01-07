package com.sxy.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * filter:
 * 作用：对服务器接收的请求资源和相应给浏览器的资源进行管理。
 *
 * 使用：
 * 创建一个实现了Filter接口的普通java类
 */
public class MyFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("我被执行了");
        //判断session
        HttpSession session = ((HttpServletRequest) servletRequest).getSession();
        //放行,转去相应的servlet
        filterChain.doFilter(servletRequest,servletResponse);
        //走完以后回来再拦截一次，此时拿到的req和res都是被servlet处理过的，是有数据的。
        System.out.println("我又被执行了");
    }

    @Override
    public void destroy() {

    }
}
