package com.lgcns.swainno.jpa.web.sample5;

import org.springframework.data.repository.CrudRepository;
import com.lgcns.swainno.jpa.web.sample5.Company;

//This will be AUTO IMPLEMENTED by Spring into a Bean called companyRepository
//CRUD refers Create, Read, Update, Delete
public interface CompanyRepository extends CrudRepository<Company, Integer>{

}
