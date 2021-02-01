package com.ies.co.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class BatchSummary {
	@Id
	private Integer summaryId;
	private String batchName;
	private Integer failureTriggerCount;
	private Integer successTriggerCount;
	private Integer totalTriggerProcessed;
	
}
