package com.holycross.HolyCross.Patients.repository;

import com.holycross.HolyCross.Patients.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
