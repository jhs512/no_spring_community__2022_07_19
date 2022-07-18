package com.jhs.exam.exam2.http.servlet;

import com.jhs.exam.exam2.app.App;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class InitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
    	App.start();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        
    }
}
