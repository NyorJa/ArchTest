package com.poc.arc.arch_demo.service;

import com.poc.arc.arch_demo.dto.PersonDto;
import com.poc.arc.arch_demo.mapper.PersonMapper;
import com.poc.arc.arch_demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public List<PersonDto> getAllPersons() {
        return personRepository.findAll().stream().map(personMapper::mapFromEntityToDto).toList();
    }
}
