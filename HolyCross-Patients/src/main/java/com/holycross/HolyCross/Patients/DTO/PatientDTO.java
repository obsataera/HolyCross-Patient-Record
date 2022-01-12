package com.holycross.HolyCross.Patients.DTO;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientDTO {

    private String PatientNumber;
    private String FullName;
    private boolean IsAnOutPatient;
    private String EmailAddress;
    private int PhoneNumber;
    private LocalDate dateOfBirth;

    public boolean isAnOutPatient() {
        return IsAnOutPatient;
    }
}

