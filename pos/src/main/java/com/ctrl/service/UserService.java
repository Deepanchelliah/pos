package com.ctrl.service;

import java.util.List;

import javax.ws.rs.core.Response;

import com.ctrl.domains.User;

public interface UserService {

	List<User> findAllUsers();
}
