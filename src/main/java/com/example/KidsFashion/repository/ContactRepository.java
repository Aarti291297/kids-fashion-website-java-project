package com.example.KidsFashion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.KidsFashion.entity.ContactData;


public interface ContactRepository extends JpaRepository<ContactData, Integer>{

}