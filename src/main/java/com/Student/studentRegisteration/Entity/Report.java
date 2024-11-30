package com.Student.studentRegisteration.Entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Report {
    private String id;
    private String patientName;
    private String patientAge;
    private String patientGender;
    private String previousHealthCondition;
    private String currentMedication;
    private String prescription;
    private String imageId;
}
