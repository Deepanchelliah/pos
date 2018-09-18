package com.ctrl.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctrl.dao.UserRepositoy;
import com.ctrl.domains.User;
import com.ctrl.exceptions.Status;
import com.ctrl.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepositoy userRepositoy;
	
	@Override
	public List<User> findAllUsers() {
//		try{
//			List<User> list=new ArrayList<>();
//			userRepositoy.findAll().forEach(list::add);
//			return Response.ok().entity(list).build();
//		}catch(Exception e){
//			Status status=new Status(Status.ERROR, e.getLocalizedMessage());
//			return Response.serverError().entity(status).build();
//		}
		return null;
	}

}
