package com.medicore.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointments_types")
public class ApptmType extends Appointment{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // database id

    public enum Type{
        GENERAL_CHECK_UP,
        URGENT_CARE_VISIT,
        DENTAL_CHECK_UP
    }

    @Enumerated(EnumType.STRING)
    private Type type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="job_titles")
    private Role role;


}
