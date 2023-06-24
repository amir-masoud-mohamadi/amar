package com.geofahm.shahrdari.model.repository.education.weather;


import com.geofahm.shahrdari.model.entity.Weather18;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface WeatherRepository18 extends JpaRepository<Weather18, Long> {
    String FIND_PROJECTS = "select DISTINCT  s.year from Weather18 s ";
    String FIND_PROJECTS2 = "select s from Weather18 s where year= ?1";
    String FIND_PROJECTS4 = "select s from Weather18 s where city= ?1";
    String FIND_PROJECTS3 = "select DISTINCT  s.city from Weather18 s ";

    @Query(value = FIND_PROJECTS)
    List<Object> findYear(Sort sort);

    @Query(value = FIND_PROJECTS2)
    List<Weather18> findByYear(Sort sort, String year);


    @Query(value = FIND_PROJECTS3)
    List<Object> findCity(Sort sort);

    @Query(value = FIND_PROJECTS4)
    List<Weather18> findByCity(Sort sort, String city);
}
