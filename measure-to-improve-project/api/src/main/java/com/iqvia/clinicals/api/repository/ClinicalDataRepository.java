 package com.iqvia.clinicals.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iqvia.clinicals.api.model.ClinicalData;
import org.springframework.stereotype.Repository;


public interface ClinicalDataRepository extends JpaRepository<ClinicalData, Integer> {

	List<ClinicalData> findByPatientIdAndComponentNameOrderByMeasuredDateTime(int patientId, String componentName);

}
