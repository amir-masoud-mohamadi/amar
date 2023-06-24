package com.geofahm.shahrdari.model.repository.hotel;




import com.geofahm.shahrdari.model.entity.hotel.Hotel1010;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Hotel1010Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Hotel1010 add(Hotel1010 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Hotel1010 update(Hotel1010 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Hotel1010 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Hotel1010 findById(long customerId) {
        String sql = "select customer from Hotel1010 customer where customer.id="+customerId;
        try{
            return (Hotel1010) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Hotel1010> findAll() {

        return entityManager.createQuery("select c from Hotel1010 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Hotel1010 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Hotel1010> findByYear(String year) {

        return entityManager.createQuery("select s from Hotel1010 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Hotel1010 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Hotel1010> findByCity(String city) {

        return entityManager.createQuery("select s from Hotel1010 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
