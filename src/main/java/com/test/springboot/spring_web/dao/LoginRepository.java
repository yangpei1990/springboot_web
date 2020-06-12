package com.test.springboot.spring_web.dao;

import com.test.springboot.spring_web.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Users, Integer> {
}
