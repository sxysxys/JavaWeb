package com.sxy.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * req里的一些方法
 */
public class ServletMethod extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求头数据
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            String header = req.getHeader(s);
            System.out.println(s+"::"+header);
        }
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String s = parameterNames.nextElement();
            String parameter = req.getParameter(s);
            System.out.println(parameter);
        }
        //获取请求体，即用户数据，不管get还是post请求其实都是一样的。都是这个方法。tomcat底层早就将协议送来的数据封装成了对象。
        String user = req.getParameter("user");
        System.out.println(user);
        //当一个字段有多个name的时候，通过这种方式将所有name都获取到。
        String[] users = req.getParameterValues("user");
        for (String s : users) {
            System.out.println(s);
        }
    }
}
