package com.sxy.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Cookie的创建和存储
 */
public class CookieServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置返回的解析方式
        resp.setContentType("text/html;charset=utf-8");
        //获取cookie
        Cookie[] cookies = req.getCookies();
        if (cookies!=null){
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();
                System.out.println(name+":"+value);
            }
        }
        //使用cookie进行浏览器端的数据存储
          //创建cookie对象
        Cookie cookie = new Cookie("mouse", "thinkpad");
        //存入硬盘的cookie
        Cookie c2 = new Cookie("key", "long time");
        c2.setMaxAge(3*24*3600);
        c2.setPath("xxx");
        //响应cookie信息
        resp.addCookie(cookie);
        resp.addCookie(c2);
        resp.getWriter().write("24234");
    }
}
