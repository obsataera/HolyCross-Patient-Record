package com.holycross.HolyCross.Patients.model;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="patient_number", nullable = false)
    private String PatientNumber;

    @Column(name="IsAnOutPatient" , nullable = false)
    private boolean IsAnOutPatient;

    @Column(name="full_name", nullable = false)
    private String FullName;

    @Column(name="Email_address")
    private String EmailAddress;

    @Column(name="Phone_number")
    private int PhoneNumber;

    @Column(name="Date_of_Birth")
    private LocalDate dateOfBirth;
}
