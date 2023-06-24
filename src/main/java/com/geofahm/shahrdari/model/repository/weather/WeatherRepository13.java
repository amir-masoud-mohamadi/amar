package com.geofahm.shahrdari.model.repository.education.weather;


import com.geofahm.shahrdari.model.entity.Weather13;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface WeatherRepository13 extends JpaRepository<Weather13, Long> {
    String FIND_PROJECTS = "select DISTINCT  s.year from Weather13 s ";
    String FIND_PROJECTS2 = "select s from Weather13 s where year= ?1";
    String FIND_PROJECTS4 = "select s from Weather13 s where city= ?1";
    String FIND_PROJECTS3 = "select DISTINCT  s.city from Weather13 s ";

    @Query(value = FIND_PROJECTS)
    List<Object> findYear(Sort sort);

    @Query(value = FIND_PROJECTS2)
    List<Weather13> findByYear(Sort sort, String year);


    @Query(value = FIND_PROJECTS3)
    List<Object> findCity(Sort sort);

    @Query(value = FIND_PROJECTS4)
    List<Weather13> findByCity(Sort sort, String city);
}
