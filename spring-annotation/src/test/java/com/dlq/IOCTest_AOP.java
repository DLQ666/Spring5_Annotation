package com.dlq;

import com.dlq.aop.MathCalculator;
import com.dlq.config.MyConfigAOP;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *@program: Spring5_Annotation
 *@description:
 *@author: Hasee
 *@create: 2020-09-27 12:05
 */
public class IOCTest_AOP {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfigAOP.class);

        /*//不要自己创建对象
        MathCalculator mathCalculator = new MathCalculator();
        mathCalculator.div(1,1);*/

        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        mathCalculator.div(1,0);

        applicationContext.close();
    }
}
