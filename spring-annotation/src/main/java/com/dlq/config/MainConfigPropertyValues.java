package com.dlq.config;

import com.dlq.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//使用@PropertySource读取外部配置文件中的k/v保存到运行时的环境变量中;加载完外部的配置文件以后使用${}取出配置文件的值
@PropertySource(value = {"classpath:/person.properties"})
@Configuration
public class MainConfigPropertyValues {

    @Bean
    public Person person(){
        return new Person();
    }
}
