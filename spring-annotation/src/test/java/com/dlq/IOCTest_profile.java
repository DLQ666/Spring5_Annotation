package com.dlq;

import com.dlq.bean.Blue;
import com.dlq.bean.Yellow;
import com.dlq.config.MyConfigProfile;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 *@program: Spring5_Annotation
 *@description:
 *@author: Hasee
 *@create: 2020-09-26 16:33
 */
public class IOCTest_profile {

    //1、使用命令行动态参数：在虚拟机参数位置加载 -Dspring.profiles.active=test
    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigProfile.class);
        String[] namesForType = applicationContext.getBeanNamesForType(Blue.class);
        for (String name : namesForType) {
            System.out.println(name);
        }
    }

    //2、使用代码方式
    @Test
    public void test02() {
        //1、创建一个applicationContext
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //2、设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("test");
        //3、注册主配置类
        applicationContext.register(MyConfigProfile.class);
        //4、启动刷新容器
        applicationContext.refresh();

        Yellow bean = applicationContext.getBean(Yellow.class);
        System.out.println(bean);
        String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String name : namesForType) {
            System.out.println(name);
        }
    }
}
