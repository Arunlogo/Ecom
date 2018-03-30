package com.niit.dao;

import static org.junit.Assert.*;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import org.junit.Test;
import com.niit.configuration.DBConfiguration;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.services.ProductServiceImpl;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={DBConfiguration.class,ProductDaoImpl.class})
@Transactional
public class ProductDaoImplTest {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDaoImpl.class);
	
	@Test
	public void testProductDaoImpl() {
		
	}

	@Test
	public void testGetAllProducts() {
		ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
		List<Product> product;
		product=(List<Product>) productDao.getAllProducts();
	assertNotNull(product);	
	}

	@Test
	public void testCreateProduct() {
		
		ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
		Product product=new Product();
	product.setQuantity(37);
	product.setProductname("mob");
	product.setPrice(70);
	product.setId(103);
	product.setProductDescription("elllll");
	Category category=new Category();
	category.setCategoryname("test");
	productDao.createCategory(category);
	product.setCategory(category);
	productDao.createProduct(product);
	assertTrue(productDao.createProduct(product));	
		
	}

	@Test
	public void testGetproduct() {
		ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
		Product product=new Product();
	product=	productDao.getproduct(99);
		assertNotNull(product);
		
	}

	@Test
	public void testDeleteProduct() {
		ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
		Product product=new Product();
		
				assertFalse(productDao.deleteProduct(166));
		
	}

	@Test
	public void testSaveOrUpdateProduct() {
		
		
	}

	@Test
	public void testCreateCategory() {
		ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
		Product product=new Product();
		Category category=new Category();
		category.setCategoryname("test");
		
		productDao.createCategory(category);
		assertTrue(category.getCategoryname()=="test");
		
		
	}

	@Test
	public void testGetAllCategories() {
		ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
		productDao.getAllCategories();	
		List<Category> category;
		category=productDao.getAllCategories();
		assertNotNull(category);
		
	}

}
