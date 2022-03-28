package com.test.springboot.spring_web.dao;

import com.test.springboot.spring_web.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountsRepository extends JpaRepository<Accounts, Integer> {
    List<Accounts> findByIdBetween(int min, int max);

    Accounts findByLoginNameAndPassword(String yp, String s);

    @Query("select acc from Accounts acc where id = ?1")
    Accounts findById1(int id);
}
