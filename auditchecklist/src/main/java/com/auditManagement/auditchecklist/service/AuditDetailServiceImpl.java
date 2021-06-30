package com.auditManagement.auditchecklist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.auditManagement.auditchecklist.Repository.AuditDetailRepo;
import com.auditManagement.auditchecklist.entity.AuditDetail;

@Transactional
@Service("requestService")
public class AuditDetailServiceImpl implements AuditDetailService {

	@Autowired
	private AuditDetailRepo auditdetailrepo;

	@Override
	public AuditDetail create(AuditDetail request) {
		return auditdetailrepo.save(request);
	}

}