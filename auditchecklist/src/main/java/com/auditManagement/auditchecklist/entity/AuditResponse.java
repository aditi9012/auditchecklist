package com.auditManagement.auditchecklist.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "AuditResponse")
public class AuditResponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int respId;
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn(name = "id")
	private AuditDetail detail;
	public AuditDetail getDetail() {
		return detail;
	}
	public void setDetail(AuditDetail detail) {
		this.detail = detail;
	}
	public String getProjectExecutionStatus() {
		return ProjectExecutionStatus;
	}
	public void setProjectExecutionStatus(String projectExecutionStatus) {
		ProjectExecutionStatus = projectExecutionStatus;
	}
	public String getRemedialActionDuration() {
		return RemedialActionDuration;
	}
	public void setRemedialActionDuration(String remedialActionDuration) {
		RemedialActionDuration = remedialActionDuration;
	}
	private String ProjectExecutionStatus;
	private String RemedialActionDuration;

}
