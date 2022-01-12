package com.holycross.HolyCross.Patients.serviceImpl;

import com.holycross.HolyCross.Patients.DTO.PatientDTO;
import com.holycross.HolyCross.Patients.model.Patient;
import com.holycross.HolyCross.Patients.repository.PatientRepository;
import com.holycross.HolyCross.Patients.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository)
    {
        this.patientRepository =  patientRepository;
    }
    @Override
    public List<PatientDTO> getAllPatients() {
        List<Patient> getAllPatient = patientRepository.findAll();
        List<PatientDTO> getAllPatientDTO = new ArrayList<>();

        for(Patient patient : getAllPatient)
        {
            PatientDTO patientsDTO = new PatientDTO();

            patientsDTO.setPatientNumber(patient.getPatientNumber());
            patientsDTO.setFullName(patient.getFullName());
            patientsDTO.setEmailAddress( patient.getEmailAddress());
            patientsDTO.setDateOfBirth(patient.getDateOfBirth());
            patientsDTO.setPhoneNumber(patient.getPhoneNumber());
            patientsDTO.setIsAnOutPatient(patient.isIsAnOutPatient());

            getAllPatientDTO.add(patientsDTO);
        }

        return getAllPatientDTO;
    }
}
