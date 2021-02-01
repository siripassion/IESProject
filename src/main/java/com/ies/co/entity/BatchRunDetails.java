package com.ies.co.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class BatchRunDetails {
	@Id
	private Integer batchRunSeq;
	private String batchName;
	private String batchRunStatus;
	private Date startDate;
	private Date endDate;
	private Integer instanceNum;

}
