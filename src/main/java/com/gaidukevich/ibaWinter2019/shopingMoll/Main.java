package com.gaidukevich.ibaWinter2019.shopingMoll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("shopMall.xml");
        ShoppingService shoppingService = (ShoppingService) applicationContext.getBean("shopService");
        ShoppingMall shoppingMall = (ShoppingMall) applicationContext.getBean("shoppingMall");
    }
}
