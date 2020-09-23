package com.dlq;

import com.dlq.bean.Person;
import com.dlq.config.MainConfig;
import com.dlq.config.MainConfig2;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *@program: Spring5_Annotation
 *@description:
 *@author: Hasee
 *@create: 2020-09-23 15:11
 */
public class IOCTest {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
//        String[] definitionNames = applicationContext.getBeanDefinitionNames();
//        for (String name : definitionNames) {
//            System.out.println(name);
//        }
        System.out.println("ioc容器创建完成......");
        Object bean = applicationContext.getBean("person");
        Object bean2 = applicationContext.getBean("person");
        System.out.println(bean == bean2);
    }
}
