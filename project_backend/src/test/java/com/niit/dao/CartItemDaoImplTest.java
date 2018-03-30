package com.niit.dao;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.niit.configuration.DBConfiguration;
import com.niit.model.Cart;
import com.niit.model.Customer;
import com.niit.model.CustomerOrder;
import com.niit.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {DBConfiguration.class,CartItemDaoImpl.class})
@Transactional
public class CartItemDaoImplTest {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,CartItemDaoImpl.class);
	CartItemDao cartItemDao=(CartItemDao)context.getBean("cartItemDaoImpl");
	@Test
	public void testSaveOrUpdateCartItem() {
		
	}

	@Test
	public void testRemoveCartItem() {
		/*boolean actual=cartItemDao.removeCartItem(33);*/
	}

	@Test
	public void testGetCart() {
		Cart cart=new Cart();
		cart=cartItemDao.getCart(333);
		assertNull(cart);
	}

	@Test
	public void testCreateOrder() {
		Cart cart=new Cart();
		cart=cartItemDao.getCart(1);
		CustomerOrder customerOrder=cartItemDao.createOrder(cart);
		assertTrue(customerOrder.getOrderId()>0);
		assertTrue(customerOrder.getCart().getGrandTotal()>2800.0);
		
	}

}
