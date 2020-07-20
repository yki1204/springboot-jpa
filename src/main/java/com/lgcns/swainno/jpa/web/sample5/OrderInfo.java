package com.lgcns.swainno.jpa.web.sample5;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "order_info")
public class OrderInfo {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)  
	  private Integer id;
	  private String product;
	  private Integer price;
	  private Integer member_id;
	  
	  public Integer getId() {
		  return id;
	  }
	  
	  public void setId(Integer id) {
		  this.id = id;
	  }
	  
	  public String getProduct() {
		  return product;
	  }
	  
	  public void setProduct(String product) {
		  this.product = product;
	  }
	  
	  public Integer getPrice() {
		  return price;
	  }
	  
	  public void setPrice(Integer price) {
		  this.price = price;
	  }	  
	  
	  public Integer getMemberId() {
		  return member_id;
	  }
	  
	  public void setMemberId(Integer member_id) {
		  this.member_id = member_id;
	  }
}
