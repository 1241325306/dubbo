package com.dubbo.serverImpl;

import java.util.Arrays;
import java.util.List;

import com.dubbo.interfaces.UserService;
import com.dubbo.model.UserAddress;

public class UserServerImpl implements UserService {

	@Override
	public List<UserAddress> getUserAddressList(String userId){
		System.out.println("=========尝试调用======old===");
		UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		return Arrays.asList(address1,address2);
	}
	
	
}
