package com.example.aboutmewebsite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aboutmewebsite.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
