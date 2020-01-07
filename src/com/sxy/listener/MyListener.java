package com.sxy.listener;

import javax.servlet.*;

public class MyListener implements ServletRequestListener,ServletRequestAttributeListener{
    @Override
    //销毁
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        ServletRequest servletRequest = servletRequestEvent.getServletRequest();
        System.out.println("监听器1号凉了");
    }

    @Override
    //创建
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("监听器1号准备就绪");
    }

    @Override
    //向request添加
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        System.out.println(servletRequestAttributeEvent.getName()+":"+servletRequestAttributeEvent.getValue());
    }

    @Override
    //向request移除
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {

    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {

    }
}
