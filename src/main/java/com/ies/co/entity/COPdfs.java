package com.ies.co.entity;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class COPdfs {
	@Id
	private Integer COPdfId;
	private String planStatus;
	private String caseNumber;
	private Blob pdfDocument;
	private String planName;
	
}
