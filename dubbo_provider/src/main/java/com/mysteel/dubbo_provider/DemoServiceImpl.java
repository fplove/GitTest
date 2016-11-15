package com.mysteel.dubbo_provider;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {

	public List getUsers() {
		List list  = new ArrayList();
		list.add("user1");
		list.add("user2");
		return list;
	}

	public String sayHello(String name) {
		return "hello  "+name;
	}

}
