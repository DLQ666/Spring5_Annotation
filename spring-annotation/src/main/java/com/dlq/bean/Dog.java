package com.dlq.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *@program: Spring5_Annotation
 *@description:
 *@author: Hasee
 *@create: 2020-09-25 15:01
 */

@Component
public class Dog implements ApplicationContextAware {

    public Dog(){
        System.out.println("dog... constructor ...");
    }

    //对象创建并赋值之后调用
    @PostConstruct
    public void init(){
        System.out.println("dog... @PostConstruct ... ");
    }

    //在容器移除对象之前
    @PreDestroy
    public void destory(){
        System.out.println("dog ... @PreDestroy ...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
