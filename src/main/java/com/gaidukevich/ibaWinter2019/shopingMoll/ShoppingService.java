package com.gaidukevich.ibaWinter2019.shopingMoll;

public class ShoppingService {
    private ShoppingMall shoppingMall;

    public ShoppingService() {
    }

    public void setShoppingMall(ShoppingMall shoppingMall) {
        this.shoppingMall = shoppingMall;
    }

    public void openShoppingMall() {
        System.out.println("Open new SopCenter: " + shoppingMall.getName());
        System.out.println("ShopPoint(" + shoppingMall.getShopPoints().size() + ") :");
        shoppingMall.getShopPoints().forEach(System.out::println);
        System.out.println("Renta = " + shoppingMall.getRent());
    }
}
