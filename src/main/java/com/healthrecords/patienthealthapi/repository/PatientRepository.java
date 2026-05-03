package com.healthrecords.patienthealthapi.repository;

import com.healthrecords.patienthealthapi.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}