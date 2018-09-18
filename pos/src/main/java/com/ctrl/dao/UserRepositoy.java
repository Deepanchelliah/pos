package com.ctrl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctrl.domains.User;

public interface UserRepositoy extends JpaRepository<User, Long> {

}
