package com.hibernate.fourstates.FourStatesHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

// four states of hibernate ->new->transient->persist OR save-> detach -> delete OR remove -> garbage

@Entity
public class Laptop1 
{
	@Id
	private int id;
	private String brand;
	@Override
	public String toString() {
		return "Laptop1 [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	private int price;

}
