package com.example.bootJPA.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bootJPA.model.UserDetails;
import com.example.bootJPA.repositary.UserRepositary;


public interface Userservice {
	List<UserDetails>getAllUserDEtails();
	void saveUserDetais(UserDetails userdetails);
	UserDetails  getUserDetailsById(int id);
	void deleteUserDetailsById(int id);
	
}

	/*
	 * Method of get all the user details UserDetails is class or model which
	 * contains the getter and setter
	 */

	/* getalluserdetails is method */
	/* return type is list */

	/*public List<UserDetails> getalluserdetails() {
		List<UserDetails> udetailsList = new ArrayList<>();
		userrepo.findAll().forEach(user -> udetailsList.add(user));
		return udetailsList;*/

	

	/* Get user details by id */
	/* userrepo is UserRepositary */
	/*public UserDetails getUserdetailsById(Integer id) {
		return userrepo.findById(id).get();
*/
	

	/* save or update method */
	/*public boolean saveOrUpdateUserdetails(UserDetails user1) /* user1 is object of the userdetails */ 
		/*UserDetails updateUser = userrepo.save(user1);
		if (userrepo.findById(updateUser.getId()) != null) {
			return true;
		}
		return false;
	}

	/* Delete method */
	/* delete by id */
	/*public boolean deleteUserDetails(Integer id) {
		userrepo.deleteById(id);
		if (userrepo.findById(id) != null) {
			return true;
		}
		return false;

	}
}
*/