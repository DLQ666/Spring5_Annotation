package com.dlq;

import com.dlq.bean.Car;
import com.dlq.config.MainConfigOfLifeCycle;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *@program: Spring5_Annotation
 *@description:
 *@author: Hasee
 *@create: 2020-09-25 11:39
 */
public class IOCTest_LifeCycle {

    @Test
    public void test01() {
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成。。。");

//        applicationContext.getBean("car");
        //关闭容器
        applicationContext.close();
    }
}
