package com.holycross.HolyCross.Patients.controller;

import com.holycross.HolyCross.Patients.DTO.PatientDTO;
import com.holycross.HolyCross.Patients.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    private PatientService patientService;


    @Autowired
    public PatientController(PatientService patientService)
    {
        this.patientService = patientService;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("Patients")
    private List<PatientDTO> patientService(){

        return patientService.getAllPatients();
    }
}
