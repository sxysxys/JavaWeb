package com.sxy.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 生命周期：从第一次调用到服务器关闭
 *
 */
public class ServletLife extends HttpServlet {
    //servlet第一次进内存的时候调用。
    @Override
    public void init() throws ServletException {
        System.out.println("我创建了奥");
    }
//处理请求的方法。
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("servlet life");
    }
//销毁的时候调用的方法，当服务器关闭才销毁。
    @Override
    public void destroy() {
        System.out.println("我凉透了奥");
    }
}
