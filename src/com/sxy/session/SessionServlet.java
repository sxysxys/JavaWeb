package com.sxy.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //拿到session对象,看请求的cookie中有没有sessionid，如果没有就会创建一个新的session对象。
        HttpSession session = req.getSession();
        session.setAttribute("name","zhangsan");
        resp.getWriter().write("session study");
    }
}
