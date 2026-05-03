package com.healthrecords.patienthealthapi.service;

import com.healthrecords.patienthealthapi.model.Patient;
import com.healthrecords.patienthealthapi.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    // Add a new patient
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    // Get all patients
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    // Get patient by ID
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));
    }

    // Update patient
    public Patient updatePatient(Long id, Patient updatedPatient) {
        Patient existing = getPatientById(id);
        existing.setName(updatedPatient.getName());
        existing.setAge(updatedPatient.getAge());
        existing.setBloodGroup(updatedPatient.getBloodGroup());
        existing.setDiagnosis(updatedPatient.getDiagnosis());
        existing.setDoctorAssigned(updatedPatient.getDoctorAssigned());
        return patientRepository.save(existing);
    }

    // Delete patient
    public String deletePatient(Long id) {
        getPatientById(id); // This will throw exception if not found
        patientRepository.deleteById(id);
        return "Patient with id " + id + " deleted successfully";
    }
}