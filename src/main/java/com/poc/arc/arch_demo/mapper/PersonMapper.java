package com.poc.arc.arch_demo.mapper;

import com.poc.arc.arch_demo.dto.PersonDto;
import com.poc.arc.arch_demo.entity.Person;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {
    PersonDto mapFromEntityToDto(Person person);
}
