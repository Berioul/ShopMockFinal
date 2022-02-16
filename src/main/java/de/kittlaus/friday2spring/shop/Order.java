package de.kittlaus.friday2spring.shop;

import java.util.HashMap;

public class Order {
    private String id;
    private HashMap<String, Product> products;

    public Order(String id, HashMap<String, Product> products) {
        this.id = id;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public HashMap<String, Product> getProducts() {
        return products;
    }


    public void setProducts(HashMap<String, Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", products=" + products +
                '}';
    }
}
