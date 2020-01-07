package com.sxy.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        req.setAttribute("dfs","sfa");
        res.getWriter().write("my first servlet");
        ServletConfig servletConfig = this.getServletConfig();
        String val = servletConfig.getInitParameter("bbb");
        System.out.println(val);
        System.out.println("my first servlet");
    }
}
