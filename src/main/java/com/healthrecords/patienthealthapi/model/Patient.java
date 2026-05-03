package com.healthrecords.patienthealthapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patients")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   //PRIMARY KEY

    private String name;

    private int age;

    private String bloodGroup;

    private String diagnosis;

    private String doctorAssigned;
}