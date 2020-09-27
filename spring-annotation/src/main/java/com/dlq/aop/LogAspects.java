package com.dlq.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect     //告诉Spring当前类是一个切面类
public class LogAspects {

    //抽取公共的切入点表达式
    //1、本类引用
    //2、其他的切面引用
    @Pointcut("execution(public int com.dlq.aop.MathCalculator.*(..))")
    public void pointCut() {
    }

    //@Before：在目标方法之前切入：切入点表达式（指定在哪个方法切入）
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("" + joinPoint.getSignature().getName() + "运行。。。@Before:参数列表是：{" + Arrays.asList(args) + "}");
    }

    //@After：在目标方法返回或者异常后调用
    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println("" + joinPoint.getSignature().getName() + "除法结束。。。@After");
    }

    //@AfterReturning：在目标方法返回后调用
    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(JoinPoint joinPoint,Object result) { //JoinPoint一定要出现在参数表的第一位
        System.out.println("" + joinPoint.getSignature().getName() + "除法正常返回。。。@AfterReturning:运行结果：{" + result + "}");
    }

    //@AfterThrowing：在目标方法抛出异常后调用
    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception) {
        System.out.println("" + joinPoint.getSignature().getName() + "除法异常。。。@AfterThrowing:异常信息：{" + exception + "}");
    }
}
