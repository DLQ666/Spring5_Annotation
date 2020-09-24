package com.dlq.condition;

import com.dlq.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 *@program: Spring5_Annotation
 *@description:
 *@author: Hasee
 *@create: 2020-09-24 16:23
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * importingClassMetadata：当前类的注解信息
     * BeanDefinitionRegistry：BeanDefinition注册类
     *      把所有需要添加到容器中的bean：调用
     *      BeanDefinitionRegistry.registerBeanDefinition 手动注册进来
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean red = registry.containsBeanDefinition("com.dlq.bean.Red");
        boolean blue = registry.containsBeanDefinition("com.dlq.bean.Blue");
        if (red&&blue){
            //指定bean定义信息：（Bean的类型）
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            //注册一个Bean，指定bean名
            registry.registerBeanDefinition("rainBow",beanDefinition);
        }
    }
}
