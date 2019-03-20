package com.gaidukevich.ibaWinter2019.shopingMoll;

import java.util.List;
import java.util.Objects;

public class ShoppingMall {
    private String name;
    private List<ShopPoint> shopPoints;
    private int rent;

    public ShoppingMall(String name, List<ShopPoint> shopPoints, int rent) {
        this.name = name;
        this.shopPoints = shopPoints;
        this.rent = rent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ShopPoint> getShopPoints() {
        return shopPoints;
    }

    public void setShopPoints(List<ShopPoint> shopPoints) {
        this.shopPoints = shopPoints;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingMall that = (ShoppingMall) o;
        return rent == that.rent &&
                Objects.equals(name, that.name) &&
                Objects.equals(shopPoints, that.shopPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shopPoints, rent);
    }

    @Override
    public String toString() {
        return "ShoppingMall{" +
                "name='" + name + '\'' +
                ", shopPoints=" + shopPoints +
                ", rent=" + rent +
                '}';
    }
}
