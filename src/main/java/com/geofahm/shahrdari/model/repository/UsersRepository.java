package com.geofahm.shahrdari.model.repository;

import com.geofahm.shahrdari.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public interface UsersRepository extends JpaRepository<Users, Long>,JpaSpecificationExecutor<Users> {
    Users findByEmail(String email);
    @Query(value = "SELECT u FROM Users u where u.email = ?1")
    Users findByPhone(String phone);
    @Transactional
    @Modifying
    @Query("update Users u set u.password = ?1 where u.email = ?2")
    void setPassword(String password, String phone);


}
