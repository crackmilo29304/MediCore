package com.medicore.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    int id;
    
    @Column(name="document_number")
    String documentNumber;

    String password;
    
    String role; //ADMIN, EMPLOYEE, PATIENT
    
    @Column(name="source_table_id")
    int sourceTableId;
}
