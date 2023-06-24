package com.geofahm.shahrdari.model.repository.education;



import com.geofahm.shahrdari.model.entity.Education1715;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository1715 extends JpaRepository<Education1715, Long> {
    String FIND_PROJECTS = "select DISTINCT  s.year from Education1715 s ";
    String FIND_PROJECTS2 = "select s from Education1715 s where year= ?1";
    String FIND_PROJECTS4 = "select s from Education1715 s where city= ?1";
    String FIND_PROJECTS3 = "select DISTINCT  s.city from Education1715 s ";

    @Query(value = FIND_PROJECTS)
    List<Object> findYear(Sort sort);

    @Query(value = FIND_PROJECTS2)
    List<Education1715> findByYear(Sort sort, String year);


    @Query(value = FIND_PROJECTS3)
    List<Object> findCity(Sort sort);

    @Query(value = FIND_PROJECTS4)
    List<Education1715> findByCity(Sort sort, String city);
}
