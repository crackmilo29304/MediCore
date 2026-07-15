package com.medicore.app.repository;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicore.app.models.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

    public boolean existsByDateTime(OffsetDateTime dateTime);
    public List<Appointment> findByPatient_DocumentNumber(String documentNumber);
    public List<Appointment> findByDateTimeAndPatient_DocumentNumber(OffsetDateTime dateTime, String documentNumber);
    public List<Appointment> findByIsAvailable(boolean available);
    
}
