package com.dlq;

import com.dlq.bean.Person;
import com.dlq.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@program: Spring5_Annotation
 *@description:
 *@author: Hasee
 *@create: 2020-09-23 14:29
 */
public class MainTest {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person) applicationContext.getBean("person");
//        System.out.println(person);

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
    }
}
