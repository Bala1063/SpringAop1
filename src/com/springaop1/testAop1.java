/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.springaop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author BA391760
 */
public class testAop1 {
     public static void main(String[] args)
   {
       ApplicationContext context=new ClassPathXmlApplicationContext("SpringAop1.xml");
       IProduct iProduct=(IProduct)context.getBean("proxy");
       iProduct.sellProduct(500);
   }
}
