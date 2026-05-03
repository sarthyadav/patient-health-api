package com.healthrecords.patienthealthapi.controller;

import com.healthrecords.patienthealthapi.model.Patient;
import com.healthrecords.patienthealthapi.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    // POST /patients — Add new patient
    @PostMapping
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient) {
        Patient saved = patientService.addPatient(patient);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    // GET /patients — Get all patients
    @GetMapping
    public ResponseEntity<List<Patient>> getAllPatients() {
        List<Patient> patients = patientService.getAllPatients();
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }

    // GET /patients/{id} — Get patient by ID
    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
        Patient patient = patientService.getPatientById(id);
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }

    // PUT /patients/{id} — Update patient
    @PutMapping("/{id}")
    public ResponseEntity<Patient> updatePatient(
            @PathVariable Long id,
            @RequestBody Patient patient) {
        Patient updated = patientService.updatePatient(id, patient);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    // DELETE /patients/{id} — Delete patient
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePatient(@PathVariable Long id) {
        String message = patientService.deletePatient(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}