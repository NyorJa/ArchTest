package com.poc.arc.arch_demo.controller;

import com.poc.arc.arch_demo.dto.PersonDto;
import com.poc.arc.arch_demo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/all")
    public List<PersonDto> getAllPersons() {
        return personService.getAllPersons();
    }
}
