package com.demo.service;

import com.demo.domain.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    Order o1=new Order(3,"Chocos",120.5);
    Order o2=new Order(6,"Lays",22.4);
    EmailService es=new EmailService();


    @Test
    public void testGetInstance(){
        assertTrue(es instanceof EmailService);
    }
    @Test(expected = RuntimeException.class)
    public void testSendEmail_withOneArguments() {
        es.sendEmail(o1);
    }
    @Test
    public void testSendEmail_withTwoArguments()
    {
        assertTrue(es.sendEmail(o2,"Notified"));
    }


}
