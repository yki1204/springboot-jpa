package com.lgcns.swainno.jpa.web.sample1.service;

import com.lgcns.swainno.jpa.web.sample1.entity.Company;
import com.lgcns.swainno.jpa.web.sample1.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService{
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> retrieveCompanies() throws Exception {
        return companyRepository.findAll();
    }

    @Override
    public Company retrieveCompany(Long id) throws Exception {
        Optional<Company> optional = companyRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public void saveCompany(Company company) throws Exception {
        companyRepository.save(company);
    }

    @Override
    public void deleteCompany(Long id) throws Exception {
        companyRepository.deleteById(id);
    }

    @Override
    public void updateCompany(Company company) throws Exception {
        companyRepository.save(company);
    }
}
