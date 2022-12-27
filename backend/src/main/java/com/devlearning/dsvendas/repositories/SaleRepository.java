package com.devlearning.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devlearning.dsvendas.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}