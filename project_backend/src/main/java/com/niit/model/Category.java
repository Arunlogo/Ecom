package com.niit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String categoryname;
@OneToMany(mappedBy="category")
private List<Product> product;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCategoryname() {
	return categoryname;
}
public List<Product> getProduct() {
	return product;
}
public void setProduct(List<Product> product) {
	this.product = product;
}
public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}

}


