package com.geofahm.shahrdari.model.repository.bazarmali;



import com.geofahm.shahrdari.model.entity.bazarmali.Mali1114;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class Mali1114Repository {
    
    @PersistenceContext
    public EntityManager entityManager;

    @Transactional(readOnly=false)
    public Mali1114 add(Mali1114 customer) {

        entityManager.persist(customer);
        return customer;
    }
    @Transactional(readOnly=false)
    public Mali1114 update(Mali1114 customer) {
        entityManager.merge(customer);
        return customer;
    }

    @Transactional(readOnly=false)
    public void delete(long customerId) {

        Mali1114 cusomer = findById(customerId);
        entityManager.remove(cusomer);
    }

    @Transactional(readOnly=true)
    public Mali1114 findById(long customerId) {
        String sql = "select customer from Mali1114 customer where customer.id="+customerId;
        try{
            return (Mali1114) entityManager.createQuery(sql).getSingleResult();
        }catch(Exception e){
        }
        return null;
    }

    @Transactional(readOnly=true)
    public List<Mali1114> findAll() {

        return entityManager.createQuery("select c from Mali1114 as c order by c.id").getResultList();
    }


    @Transactional(readOnly=true)
    public List<Object> findYear() {

        return entityManager.createQuery("select DISTINCT  s.year from Mali1114 as s order by s.year desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Mali1114> findByYear(String year) {

        return entityManager.createQuery("select s from Mali1114 s  where s.year= '"+year+"' order by s.id").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Object> findCity() {

        return entityManager.createQuery("select DISTINCT  s.city from Mali1114 as s order by s.city desc").getResultList();
    }

    @Transactional(readOnly=true)
    public List<Mali1114> findByCity(String city) {

        return entityManager.createQuery("select s from Mali1114 s where s.city= '"+city+"' order by s.id").getResultList();
    }
}
