package com.dlq.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 *@program: Spring5_Annotation
 *@description:
 *@author: Hasee
 *@create: 2020-09-24 15:57
 */

//自定义逻辑返回需要导入的组件
public class MyImportSelector implements ImportSelector {

    //返回值，就是要导入到容器中的组件全类名
    //AnnotationMetadata：当前标注@Import注解的类的所有信息
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[]{"com.dlq.bean.Blue","com.dlq.bean.Yellow"};
    }

}
