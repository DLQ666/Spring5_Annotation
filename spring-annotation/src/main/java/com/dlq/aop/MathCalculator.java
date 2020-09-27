package com.dlq.aop;

/**
 *@program: Spring5_Annotation
 *@description: 业务逻辑类
 *@author: Hasee
 *@create: 2020-09-26 17:30
 */
public class MathCalculator {

    public int div(int i,int j){
        System.out.println("MathCalculator... div...");
        return i/j;
    }
}
