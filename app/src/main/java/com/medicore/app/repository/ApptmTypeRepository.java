package com.medicore.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicore.app.models.ApptmType;

@Repository
public interface ApptmTypeRepository extends JpaRepository<ApptmType, Integer> {

}
