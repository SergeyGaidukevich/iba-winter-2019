package com.gaidukevich.ibaWinter2019.shopingMoll;

import java.util.Objects;

public class ShopPoint {
    private String name;
    private String production;

    public ShopPoint(String name, String production) {
        this.name = name;
        this.production = production;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopPoint shopPoint = (ShopPoint) o;
        return Objects.equals(name, shopPoint.name) &&
                Objects.equals(production, shopPoint.production);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, production);
    }

    @Override
    public String toString() {
        return "ShopPoint{" +
                "name='" + name + '\'' +
                ", production='" + production + '\'' +
                '}';
    }
}
