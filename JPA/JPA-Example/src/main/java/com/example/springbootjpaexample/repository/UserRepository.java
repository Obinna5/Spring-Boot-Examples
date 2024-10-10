package com.example.springbootjpaexample.repository;

import com.example.springbootjpaexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface UserRepository extends JpaRepository<User, Long> {

}


// The repository is used to perform CRUD operations on the User entity.
// It extends the JpaRepository interface from Spring Data JPA.
