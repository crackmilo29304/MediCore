package com.medicore.app.models;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "prescriptions")
@Entity
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //DB

    @ManyToOne(fetch = FetchType.LAZY) 
    @JoinColumn(name = "appointment_id", nullable = false) //FK
    private Appointment appointment;

    @ManyToOne(fetch = FetchType.LAZY) 
    @JoinColumn(name = "medication_id", nullable = false) //FK
    private Medicine medicine;

    @Column(name="indications")
    private String directions;

    private String dosage;
    
    
    
}
