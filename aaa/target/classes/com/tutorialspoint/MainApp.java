package com.tutorialspoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

/**
 * Created by Administrator on 2016/5/7.
 * 调用Bean 实习依赖注入DI
 */


public class MainApp {
    public static void main(String[] args) {

      //  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");/**接口实现搜索bean配置文件**/

     //   HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

         XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml"));
         HelloWorld helloWorld = (HelloWorld)factory.getBean("helloWorld");



        String message = helloWorld.getMessage();
        System.out.println(message);
    }
}
