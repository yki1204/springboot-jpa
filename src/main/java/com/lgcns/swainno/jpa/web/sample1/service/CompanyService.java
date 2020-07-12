package com.lgcns.swainno.jpa.web.sample1.service;

import com.lgcns.swainno.jpa.web.sample1.entity.Company;
import com.lgcns.swainno.jpa.web.sample1.entity.Member;

import java.util.List;

public interface CompanyService {
    List<Company> retrieveCompanies() throws Exception;

    Company retrieveCompany(Long id) throws Exception;

    void saveCompany(Company company) throws Exception;

    void deleteCompany(Long id) throws Exception;

    void updateCompany(Company company) throws Exception;
}
