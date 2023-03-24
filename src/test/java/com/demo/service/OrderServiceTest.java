package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OrderServiceTest {
    OrderService os=new OrderService();
    Order o1=new Order(3,"Chocos",120.5);
    Order o2=new Order(6,"Lays",22.4);


    @Test
    public void testOrderGetInstance(){
        assertTrue(os instanceof OrderService);
    }
    @Test(expected = RuntimeException.class)
    public void testPlaceOrder_withOneArguments(){
        os.placeOrder(o1);
    }

    @Test
    public void testPlaceOrder_withTwoArguments(){
        assertTrue(os.placeOrder(o2,"Order Placed"));
    }

}
