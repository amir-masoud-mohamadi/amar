package com.geofahm.shahrdari.model.repository.shakhes;


import com.geofahm.shahrdari.model.entity.shakhes.Geymat1712;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Geymat1712Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Geymat1712 add(Geymat1712 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Geymat1712 update(Geymat1712 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Geymat1712 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Geymat1712 findById(long customerId) {
        String sql = "select customer from Geymat1712 customer where customer.id="+customerId;
        try{
            return (Geymat1712) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Geymat1712> findAll() {

        return entityManager.createQuery("select c from Geymat1712 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Geymat1712 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Geymat1712> findByYear(String year) {

        return entityManager.createQuery("select s from Geymat1712 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Geymat1712 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Geymat1712> findByCity(String city) {

        return entityManager.createQuery("select s from Geymat1712 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
