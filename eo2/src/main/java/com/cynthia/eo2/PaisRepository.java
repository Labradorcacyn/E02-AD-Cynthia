package com.cynthia.eo2;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface PaisRepository extends JpaRepository<Pais, Integer> {

}
