package com.example.KidsFashion.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.KidsFashion.entity.CheckoutData;

public interface CheckRepository extends JpaRepository<CheckoutData, Integer>{

}
