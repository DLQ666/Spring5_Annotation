package com.dlq.config;

import com.dlq.bean.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 *@program: Spring5_Annotation
 *@description:
 *@author: Hasee
 *@create: 2020-09-23 14:42
 */

//配置类==配置文件
@Configuration      //告诉Spring这是一个配置类
@ComponentScans(value = {
        @ComponentScan(value = "com.dlq",includeFilters = {
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
        },useDefaultFilters = false)
})
//ComponentScan     value：指定要扫描的包
//excludeFilters = Filter[]  ：指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[]  ：指定扫描的时候只需要包含哪些组件
//FilterType.ANNOTATION ：按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定类型
//FilterType.ASPECTJ：使用ASPECTJ表达式
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则
public class MainConfig {

    //给容器中注册一个Bean;类型为返回值类型，id默认是用方法名为id
    @Bean
    public Person person(){
        return new Person("lisi",18);
    }
}
