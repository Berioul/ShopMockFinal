package de.kittlaus.friday2spring.shop;

import java.util.HashMap;

public class OrderRepo {

    private HashMap<String, Order> orders;

    public OrderRepo() {
        orders = new HashMap<>();

    }


    public HashMap<String, Order> list() {
        return orders;
    }

    public void add(Order value) {
        orders.put(value.getId(), value);

    }
    public Order getOrder (String id){
        return orders.get(id);

    }

}
