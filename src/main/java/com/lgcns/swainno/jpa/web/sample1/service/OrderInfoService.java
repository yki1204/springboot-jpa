package com.lgcns.swainno.jpa.web.sample1.service;

import com.lgcns.swainno.jpa.web.sample1.entity.OrderInfo;

import java.util.List;

public interface OrderInfoService {
    List<OrderInfo> retrieveOrderInfos() throws Exception;

    OrderInfo retrieveOrderInfo(Long id) throws Exception;

    void saveOrderInfo(OrderInfo orderInfo) throws Exception;

    void deleteOrderInfo(Long id) throws Exception;

    void updateOrderInfo(OrderInfo orderInfo) throws Exception;
}
