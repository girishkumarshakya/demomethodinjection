package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String args[]){
        AbstractApplicationContext acontext = new ClassPathXmlApplicationContext("config.xml");
        ACA applicationContextAware = acontext.getBean("appcontext",ACA.class);
        ApplicationContext context = applicationContextAware.getContext();
        ABean aBean = context.getBean("abean",ABean.class);
        System.out.println(aBean);
        ABean aBean1 = context.getBean("abean",ABean.class);
        System.out.println(aBean1);
        System.out.println("======================================================");
        BBean bBean = context.getBean("bbean",BBean.class);
        System.out.println(bBean);
        BBean bBean1 = context.getBean("bbean",BBean.class);
        System.out.println(bBean1);
        acontext.registerShutdownHook();
    }


}
