package com.lease.demo.service.impl;

import com.lease.demo.mapper.OrderMapper;
import com.lease.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/8.
 */
@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderMapper orderMapper;


    @Override
    public boolean addProductToShopCart(Object userId, String userAddr, String orderCode) {
        return orderMapper.addProductToShopCart(userId,userAddr,orderCode);
    }

    @Override
    public String findMaxOrderId() {
        return orderMapper.findMaxOrderId();
    }

    @Override
    public boolean addShopCart(String orderId, String productId, Float price, String productName, String productPic, String odetailNum, String odetailDay)
    {
        return orderMapper.addShopCart(orderId,productId,price,productName,
                productPic,odetailNum,odetailDay);
    }

    @Override
    public boolean addRent(Object userId, String userAddr, String orderCode)
    {
        return orderMapper.addRent(userId,userAddr,orderCode);
    }

    @Override
    public boolean addRentToOrderDetail(String orderId, String productId, Float price, String productName, String productPic, String odetailNum, String odetailDay)
    {
        return orderMapper.addRentToOrderDetail(orderId,productId,price,productName,
                productPic,odetailNum,odetailDay);
    }


}
