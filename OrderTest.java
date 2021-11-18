package com.example.demo;

import java.util.List;

import org.apache.el.stream.Optional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RunWith(SpringRunner.class)
public class OrderTest {
   @Autowired
   private OrderRepository repo;
   @Test
   public void testCreateOrder()
   {
	   Order order=new Order(1,"shanvi","dec","20");
	   repo.save(order);
   }
   
   
   @Test
   public void getOrderTest()
   {
	   Order order=repo.findById(1l).get();
	   Assertions.assertThat(order.getId()).isEqualTo(1l);
	   
   }
   @Test
   public void getListOrderTest()
   {
	List<Order> order=(List<Order>) repo.findAll();
	Assertions.assertThat(order.size()).isGreaterThan(0);
   }
   
   
   @Test
   public void updateOrderTest()
   {
	   Order order=repo.findById(1l).get();
	   order.setAmount("90");
	   Order orderupdated=repo.save(order);
	   Assertions.assertThat(orderupdated.getAmount()).isEqualTo(90);
   }
   @Test 
   public void deleteOrder()
   {
	   Order order = repo.findById(1L).get();

       repo.delete(order);


	   
   
}
