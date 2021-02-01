package com.ies.co.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CO_TRIGGERS")
public class COTriggers {

	@Id 
	private Integer trgId;
	private Integer caseNum;
	private Date createDt;
	private String trgStatus;
	private Date updateDt;
	
}
