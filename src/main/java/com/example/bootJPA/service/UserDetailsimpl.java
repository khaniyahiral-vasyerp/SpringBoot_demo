package com.example.bootJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bootJPA.model.UserDetails;
import com.example.bootJPA.repositary.UserRepositary;
@Service
public class UserDetailsimpl implements Userservice {
	@Autowired
	private UserRepositary userrepo;

	@Override
	public List<UserDetails> getAllUserDEtails() {
		// TODO Auto-generated method stub

		return (List<UserDetails>) userrepo.findAll();
	}

	@Override
	public void saveUserDetais(UserDetails userdetails) {
		// TODO Auto-generated method stub
		this.userrepo.save(userdetails);
	}

	@Override
	public UserDetails getUserDetailsById(int id) {
		// TODO Auto-generated method stub
		Optional<UserDetails> optional = userrepo.findById(id);
		UserDetails userdetails=null;
		if(optional.isPresent()) {
			userdetails=optional.get();
			}
		else
		{
			throw new RuntimeException ("userdetails not  found for id:: "+id);
		}
		return userdetails;
	}

	@Override
	public void deleteUserDetailsById(int id) {
		// TODO Auto-generated method stub
		this.userrepo.deleteById(id);

	}

}
