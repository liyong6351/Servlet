package com.liyog.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-22 16:27 </p>
 * <p> description  </p>
 **/
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("我被初始化了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("我被注销掉了");
    }
}
