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
import com.niit.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {DBConfiguration.class,CustomerDaoImpl.class})
@Transactional
public class CustomerDaoImplTest {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,CustomerDaoImpl.class);
	CustomerDao customerDao=(CustomerDao)context.getBean("customerDaoImpl");
	@Test
	public void testRegisterCustomer() {
		/*Customer customer=new Customer();
		CustomerDao customerDao=(CustomerDao)context.getBean("customerDaoImpl");
		customerDao.registerCustomer(customer);
		assertFalse(customer.getId()>0);*/
	}

	@Test
	public void testIsEmailValid() {
		boolean actual=customerDao.isEmailValid("a@gmail.com");
		assertFalse(actual);
		
	}

	@Test
	public void testIsUsernameValid() {
		boolean actual=customerDao.isUsernameValid("arun");
		assertFalse(actual);
		
	}

	@Test
	public void testGetUser() {
		/*User user=new User();
		user.setUsername("saber");
		user=customerDao.getUser(user.getUsername());
		if(user.getUsername()=="saber") {
		assertNotNull(user);
		*/
	}

}
