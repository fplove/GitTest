package com.mysteel.dubbo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysteel.dubbo_provider.DemoService;

public class Consumer {
	 public static void main(String[] args) throws Exception {  
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
	                new String[] { "spring-dubbo_consumer.xml" });  
	        context.start();  
	  
	        DemoService demoService = (DemoService) context.getBean("demoService"); //  
	        String hello = demoService.sayHello("tom"); // ִ  
	        System.out.println(hello); //   
	  
	        //   
	        List list = demoService.getUsers();  
	        if (list != null && list.size() > 0) {  
	            for (int i = 0; i < list.size(); i++) {  
	                System.out.println(list.get(i));  
	            }  
	        }  
	        // System.out.println(demoService.hehe());  
	        System.in.read();  
	    }  
}
