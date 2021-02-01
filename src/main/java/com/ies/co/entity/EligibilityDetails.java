package com.ies.co.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EligibilityDetails {
	
	@Id
	private Integer edTraceId;
	private String benefitAmt;
	private Integer caseNum;
	private Date createDt;
	private String denialReason;
	private String planEndDt;
	private String planName;
	private Date planStartDt;
	private String planStatus;
	private Date updateDt;
	
}
