package com.sxy.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * servletContext对象学习
 */
public class ContextServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取servletContext对象
        //第一种方法
        ServletContext sc1 = this.getServletContext();
/*        //第二种方法
        ServletContext sc2 = this.getServletConfig().getServletContext();
        //第三种方法
        ServletContext sc3 = req.getSession().getServletContext();*/
        sc1.setAttribute("first","servletContext是个蛋");
    }
}
