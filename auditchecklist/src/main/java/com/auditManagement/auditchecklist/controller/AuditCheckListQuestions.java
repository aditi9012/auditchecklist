package com.auditManagement.auditchecklist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.auditManagement.auditchecklist.entity.AuditDetail;
import com.auditManagement.auditchecklist.service.AuditDetailService;

@Controller
public class AuditCheckListQuestions {
	
	@Autowired
	private AuditDetailService auditdetailservice;
	
	@RequestMapping(value="/AuditCheckListQuestions", method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("AuditDetail", new AuditDetail());
		return "auditchecklist";
	}
	
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String save(@ModelAttribute("auditdetail") AuditDetail auditdetail, ModelMap modelMap) {
		AuditDetail detail = auditdetailservice.create(auditdetail);
		modelMap.addAttribute("detail", detail);
		return "/success";
	}
	
}
