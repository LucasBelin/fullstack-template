package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Text;

@Repository
public interface TextRepository extends JpaRepository<Text, Long> { }
