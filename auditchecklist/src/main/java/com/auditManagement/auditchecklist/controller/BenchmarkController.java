package com.auditManagement.auditchecklist.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auditManagement.auditchecklist.service.BenchmarkServiceClient;

@RestController
@RequestMapping("/bench")
public class BenchmarkController {
	
	@Autowired
	private BenchmarkServiceClient benchmarkServiceClient;
	@GetMapping
	public  Map<String,Integer> test() {
		
		return benchmarkServiceClient.findAll();

}
}
