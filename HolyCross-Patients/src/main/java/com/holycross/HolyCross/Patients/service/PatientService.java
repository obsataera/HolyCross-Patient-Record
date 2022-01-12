package com.holycross.HolyCross.Patients.service;
import com.holycross.HolyCross.Patients.DTO.PatientDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PatientService {
   List<PatientDTO> getAllPatients();
}
