package com.liyog.demo.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * <p> author liyong  </p>
 * <p> date 2019-05-22 16:48 </p>
 * <p> description  </p>
 **/
public class MyHttpSessionBindingEvent implements HttpSessionBindingListener {
    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("SessionBindingEvent");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("valueUnbound");
    }
}
