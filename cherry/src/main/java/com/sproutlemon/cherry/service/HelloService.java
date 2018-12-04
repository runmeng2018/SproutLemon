package com.sproutlemon.cherry.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("banana") // 指定服务名来绑定服务，不区分大小写
public interface HelloService {

	@RequestMapping("/index") // 绑定具体该服务提供的REST接口
	String hello();

}
