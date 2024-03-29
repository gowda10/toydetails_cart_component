package com.kidzoo.toydetails.repository;


import com.kidzoo.toydetails.model.PersonalDetails;
import com.kidzoo.toydetails.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAll();

    User findByEmail(String email);

}
