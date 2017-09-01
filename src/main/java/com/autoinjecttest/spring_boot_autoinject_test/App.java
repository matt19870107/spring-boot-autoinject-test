package com.autoinjecttest.spring_boot_autoinject_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autoinject.spring_boot_autoinject.HelloService;

/**
 * Hello world!
 *
 */
@RestController
@SpringBootApplication
public class App 
{
   @Autowired
   private HelloService helloService;
   
   @RequestMapping("/")
   public String index() {
	   return helloService.sayHello();
   }
   
   public static void main(String[] args) {
	   SpringApplication.run(App.class,args);
   }
}
