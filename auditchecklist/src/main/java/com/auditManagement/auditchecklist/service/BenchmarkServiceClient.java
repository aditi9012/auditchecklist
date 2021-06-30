package com.auditManagement.auditchecklist.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


@Component
@FeignClient(path = "http://localhost:8090")  
public interface BenchmarkServiceClient {

	@GetMapping("/audit")
	 Map<String,Integer> findAll();

	    
	    
	}
