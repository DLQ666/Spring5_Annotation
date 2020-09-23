package com.dlq.config;

import com.dlq.bean.Person;
import org.springframework.context.annotation.*;

/**
 *@program: Spring5_Annotation
 *@description:
 *@author: Hasee
 *@create: 2020-09-23 14:42
 */

@Configuration
public class MainConfig2 {

    /**
     *  @see ConfigurableBeanFactory # SCOPE_PROTOTYPE
     * 	@see ConfigurableBeanFactory # SCOPE_SINGLETON
     * 	@see org.springframework.web.context.WebApplicationContext # SCOPE_REQUEST
     * 	@see org.springframework.web.context.WebApplicationContext # SCOPE_SESSION
     *
     * 	prototype：多实例：ioc容器启动并不会去调用方法创建对象放在容器中。
     * 	                  每次获取的时候才会调用方法创建对象；
     * 	singleton：单实例（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中
     * 	           以后每次获取都是从容器中（map.get()）拿
     * 	request：同一次请求创建一个实例
     * 	session：同一个session创建一个实例
     *
     * 	懒加载：
     * 	       单实例bean：默认在容器启动的时候创建对象
     * 	       懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象，并初始化；
     */
    //默认是单实例
    //@Scope("prototype")
    @Lazy
    @Bean("person")
    public Person person(){
        System.out.println("给容器中添加Person.....");
        return new Person("张三",15);
    }

    /**
     * @Conditional：按照一定条件进行判断，满足条件给容器中注册Bean
     */
}
