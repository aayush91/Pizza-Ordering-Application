package com.crunchify.restjersey;

import java.util.List;

public class Order {
 private String customer_name;
 private String address;
 private String apt;
 private String phone;
 private String size; 
 private String crust;
 private String cheese;
 private String sauce;
 private String price;
 private List<String> topping;
 
 public void setName(String name)
 {
	 this.customer_name = name;
 }
 public String getName()
 {
	 return this.customer_name;
 }
 
 public void setAddress(String address)
 {
	 this.address = address;
 }
 public String getAddress()
 {
	 return this.address;
 }
 
 public void setApt(String apartment)
 {
	 this.apt = apartment;
 }
 public String getApt()
 {
	 return this.apt;
 }
 public void setPhone(String phone)
 {
	 this.phone = phone;
 }
 public String getPhone()
 {
	 return this.phone;
 }
 
 public void setSize(String size)
 {
	 this.size = size;
 }
 public String getSize()
 {
	 return this.size;
 }
 
 public void setPrice(String price)
 {
	 this.price = price;
 }
 public String getPrice()
 {
	 return this.price;
 }
 
 public void setCrust(String crust)
 {
	 this.crust = crust;
 }
 public String getCrust()
 {
	 return this.crust;
 }
 
 public void setCheese(String cheese)
 {
	 this.cheese = cheese;
 }
 public String getCheese()
 {
	 return this.cheese;
 }
 
 public void setSauce(String sauce)
 {
	 this.sauce = sauce;
 }
 public String getSauce()
 {
	 return this.sauce;
 }
 
 public void setToppings(List<String> toppings)
 {
	 this.topping = toppings;
 }
 
 public String getToppings()
 {
	 return this.topping.toString();
 }
}
