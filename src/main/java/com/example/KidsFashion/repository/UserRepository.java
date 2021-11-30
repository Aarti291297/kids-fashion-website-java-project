package com.example.KidsFashion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.KidsFashion.entity.CheckoutData;
import com.example.KidsFashion.entity.UserData;



public interface UserRepository extends JpaRepository<UserData, Integer>{

}
