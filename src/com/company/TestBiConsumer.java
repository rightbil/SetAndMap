package com.company;

import java.util.function.BiConsumer;

 public class TestBiConsumer implements java.util.function.BiConsumer<String,Integer>{


     @Override
     public void accept(String key, Integer val) {
             System.out.println("Key : " + key);
             System.out.println("Val : " + val);
             // Bonus to employees

     }

     @Override
     public BiConsumer<String, Integer> andThen(BiConsumer<? super String, ? super Integer> after) {
         return null;
     }
 }

