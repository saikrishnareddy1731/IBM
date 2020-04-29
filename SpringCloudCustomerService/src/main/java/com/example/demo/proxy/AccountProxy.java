package com.example.demo.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Account;

@FeignClient("account-service")
public interface AccountProxy {

	@RequestMapping(method = RequestMethod.GET, value = "/getAccount/{id}")
    Account getAccounts(@PathVariable("id") Integer id);
}
