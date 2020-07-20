package com.lgcns.swainno.jpa.web.sample5;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "member")
public class Member {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)  
	  private Integer id;
	  private String name;
	  private Integer age;
	  private Integer company_id;
	  
	  public Integer getId() {
		  return id;
	  }
	  
	  public void setId(Integer id) {
		  this.id = id;
	  }
	  
	  public String getName() {
		  return name;
	  }
	  
	  public void setName(String name) {
		  this.name = name;
	  }
	  
	  public Integer getAge() {
		  return age;
	  }
	  
	  public void setAge(Integer age) {
		  this.age = age;
	  }	 
	  
	  public Integer getCompanyId() {
		  return company_id;
	  }
	  
	  public void setCompanyId(Integer company_id) {
		  this.company_id = company_id;
	  }

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", company_id=" + company_id + "]";
	}	  
	  
	  
}
