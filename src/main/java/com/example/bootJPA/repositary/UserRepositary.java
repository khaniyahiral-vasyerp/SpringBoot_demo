package com.example.bootJPA.repositary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.bootJPA.model.UserDetails;
@Repository /*connected  to the databse  */
public interface UserRepositary extends CrudRepository <UserDetails, Integer>{

}
