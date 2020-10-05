package com.dlq.service;

import org.springframework.stereotype.Service;

/**
 *@program: Spring5_Annotation
 *@description:
 *@author: Hasee
 *@create: 2020-10-05 13:19
 */
@Service
public class HelloService {

    public String sayHello(String name) {
        return "Hello " + name;
    }
}
