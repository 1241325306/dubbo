package com.dubbo.interfaces;

import java.util.List;

import com.dubbo.model.UserAddress;


public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
