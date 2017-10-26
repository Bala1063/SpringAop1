/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.springaop1;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author BA391760
 */
public class Store implements AfterReturningAdvice ,MethodBeforeAdvice{

    @Override
    public void afterReturning(Object retValue, Method method, Object[] os, Object o1) throws Throwable {
        if(Integer.parseInt(retValue.toString().trim())!=0)
            System.out.println("Your order processed");
        else 
        {
            System.out.println("Sorry, Try later"+" "+"current Stock is"+" "+Product.stock);
        }
        System.out.println(method.getName());
    }

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        for(Object i:os)
        {
            if(Integer.parseInt(i.toString().trim())>Product.stock)
            {
                System.out.println("No Stock");
                break;
            }
            else
            {
                System.out.println("your request Accepted");
            }
        }
    }
    
}
