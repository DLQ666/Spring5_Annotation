package com.dlq;

import com.dlq.bean.Boss;
import com.dlq.bean.Car;
import com.dlq.bean.Color;
import com.dlq.config.MyConfigAutowired;
import com.dlq.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *@program: Spring5_Annotation
 *@description:
 *@author: Hasee
 *@create: 2020-09-25 19:18
 */
public class IOCTest_Autowired {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigAutowired.class);
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);

        //BookDao bookDao = applicationContext.getBean(BookDao.class);
        //System.out.println(bookDao);

        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);

        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);

        Color color = applicationContext.getBean(Color.class);
        System.out.println(color);
        applicationContext.close();
    }
}
