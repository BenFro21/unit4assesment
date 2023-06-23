package com.devmountain.noteApp.repositories;

import com.devmountain.noteApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


//The interface extend “JpaRepository” which will accept two types within the carats, <Type, ID_FIELD_TYPE>
// since we are in the UserRepository, the “Type” or class we want JpaRepository to keep track of for us is the “User” class
// and its “id” field is of type “Long”.
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
