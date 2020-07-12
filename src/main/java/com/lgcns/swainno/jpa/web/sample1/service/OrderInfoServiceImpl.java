package com.lgcns.swainno.jpa.web.sample1.service;

import com.lgcns.swainno.jpa.web.sample1.entity.OrderInfo;
import com.lgcns.swainno.jpa.web.sample1.repository.OrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderInfoServiceImpl implements OrderInfoService{
    @Autowired
    private OrderInfoRepository orderInfoRepository;

    @Override
    public List<OrderInfo> retrieveOrderInfos() throws Exception {
        return orderInfoRepository.findAll();
    }

    @Override
    public OrderInfo retrieveOrderInfo(Long id) throws Exception {
        Optional<OrderInfo> optional = orderInfoRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public void saveOrderInfo(OrderInfo orderInfo) throws Exception {
        orderInfoRepository.save(orderInfo);
    }

    @Override
    public void deleteOrderInfo(Long id) throws Exception {
        orderInfoRepository.deleteById(id);
    }

    @Override
    public void updateOrderInfo(OrderInfo orderInfo) throws Exception {
        orderInfoRepository.save(orderInfo);
    }
}
