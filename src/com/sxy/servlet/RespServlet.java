package com.sxy.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * resp里的一些方法。
 */
public class RespServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("we","erw");  //设置回显的相应头，设置并且会覆盖。
        resp.addHeader("rere","rwe");//设置响应头，不会覆盖。
        resp.setContentType("text/html;charset=utf-8");  //浏览器以html解析，并且以utf-8进行编码
        resp.getWriter().write("<a>首府喀山</a>");

//        resp.sendError(404,"the method is 123");
//        req.getRequestDispatcher("my").forward(req,resp);
        resp.sendRedirect("");
    }
}
