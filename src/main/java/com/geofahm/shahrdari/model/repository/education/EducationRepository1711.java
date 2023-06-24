package com.geofahm.shahrdari.model.repository.education;



import com.geofahm.shahrdari.model.entity.Education1711;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository1711 extends JpaRepository<Education1711, Long> {
    String FIND_PROJECTS = "select DISTINCT  s.year from Education1711 s ";
    String FIND_PROJECTS2 = "select s from Education1711 s where year= ?1";
    String FIND_PROJECTS4 = "select s from Education1711 s where city= ?1";
    String FIND_PROJECTS3 = "select DISTINCT  s.city from Education1711 s ";

    @Query(value = FIND_PROJECTS)
    List<Object> findYear(Sort sort);

    @Query(value = FIND_PROJECTS2)
    List<Education1711> findByYear(Sort sort, String year);


    @Query(value = FIND_PROJECTS3)
    List<Object> findCity(Sort sort);

    @Query(value = FIND_PROJECTS4)
    List<Education1711> findByCity(Sort sort, String city);
}
