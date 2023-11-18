package com.aop.aopIntro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.aopIntro.Service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        ApplicationContext con =new ClassPathXmlApplicationContext("com/aop/aopIntro/config.xml");
        PaymentService paymentobj =con.getBean("payment",PaymentService.class);
        paymentobj.makePayment( 25000);
    }
}
