package com.geofahm.shahrdari.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.geofahm.shahrdari.model.entity.Education1723;

public interface Education1723Repository extends JpaRepository<Education1723, Long>, JpaSpecificationExecutor<Education1723> {

}