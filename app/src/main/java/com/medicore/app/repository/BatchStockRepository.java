package com.medicore.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicore.app.models.BatchStock;

@Repository
public interface BatchStockRepository extends JpaRepository<BatchStock, Integer>{
    
}
