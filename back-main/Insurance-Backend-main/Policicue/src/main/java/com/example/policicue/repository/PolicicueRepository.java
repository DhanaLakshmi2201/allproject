package com.example.policicue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.policicue.model.Policicue;

@Repository
public interface PolicicueRepository extends JpaRepository<Policicue, Long> {

	Policicue findByName(String name);
}