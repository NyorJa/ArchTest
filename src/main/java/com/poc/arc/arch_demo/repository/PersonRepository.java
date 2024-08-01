package com.poc.arc.arch_demo.repository;

import com.poc.arc.arch_demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
