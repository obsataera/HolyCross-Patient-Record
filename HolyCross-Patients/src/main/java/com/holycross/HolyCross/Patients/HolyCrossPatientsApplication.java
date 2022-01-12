package com.holycross.HolyCross.Patients;

import com.holycross.HolyCross.Patients.model.Patient;
import com.holycross.HolyCross.Patients.repository.PatientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDate;

@SpringBootApplication
@EnableJpaRepositories
public class HolyCrossPatientsApplication  implements Runnable{

	public static void main(String[] args) {

		SpringApplication.run(HolyCrossPatientsApplication.class, args);
	}

	private PatientRepository patientRepository;

	@Override
	public void run() {

		Patient p1=	new Patient (1L, "P100000001", true, "habiba sultan", "habiba@gmail", 123,  LocalDate.now());
		Patient p2=new Patient (2L, "P100000002", false, "Obsa Tarea", "obsa@gmail", 123,  LocalDate.now());
		Patient p3=	new Patient (2L, "P100000003", false, "Aster Dagne", "baba@gmail", 123,  LocalDate.now());

		patientRepository.save(p1);
		patientRepository.save(p2);
		patientRepository.save(p3);
	}
}
