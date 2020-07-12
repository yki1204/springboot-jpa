package com.lgcns.swainno.jpa.web.sample1.repository;

import com.lgcns.swainno.jpa.web.sample1.entity.Member;
import com.lgcns.swainno.jpa.web.sample1.entity.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Long> {
}
