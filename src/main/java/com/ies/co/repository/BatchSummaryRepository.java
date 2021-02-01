package com.ies.co.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ies.co.entity.BatchSummary;

public interface BatchSummaryRepository extends JpaRepository<BatchSummary, Serializable>{

}
