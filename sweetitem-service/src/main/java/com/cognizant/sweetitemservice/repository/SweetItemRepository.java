package com.cognizant.sweetitemservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.sweetitemservice.model.SweetItem;

@Repository
public interface SweetItemRepository extends JpaRepository<SweetItem, Integer>{

}
