package com.lgcns.swainno.jpa.web.sample1.repository;

import com.lgcns.swainno.jpa.web.sample1.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
