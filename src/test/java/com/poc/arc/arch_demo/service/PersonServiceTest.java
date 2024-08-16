package com.poc.arc.arch_demo.service;

import com.poc.arc.arch_demo.entity.Person;
import com.poc.arc.arch_demo.mapper.PersonMapper;
import com.poc.arc.arch_demo.mapper.PersonMapperImpl;
import com.poc.arc.arch_demo.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {
    @InjectMocks
    private PersonService personService;

    @Mock
    private PersonRepository personRepository;

    @Spy
    private PersonMapper personMapper = new PersonMapperImpl();

    @Test
    void testGetAllPersons() {
        when(personRepository.findAll()).thenReturn(List.of(Person.builder()
                .name("nyor")
                .build()));

        var persons = personService.getAllPersons();

        assertThat(persons).filteredOn(personDto -> personDto.name().equals("nyor")).isNotEmpty();
        verify(personRepository, times(1)).findAll();
    }
}