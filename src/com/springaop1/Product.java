/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.springaop1;

/**
 *
 * @author BA391760
 */
public class Product implements IProduct{
public static int stock=100;
    @Override
    public int sellProduct(int sell) {
        if(sell>stock)
        {
            return 0;
        }
        else
        {
            stock-=sell;
            return sell;
        }
    }

   
    
}
