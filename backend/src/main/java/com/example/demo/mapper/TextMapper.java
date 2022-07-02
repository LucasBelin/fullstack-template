package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.example.demo.dto.TextDto;
import com.example.demo.model.Text;

@Mapper(componentModel = "spring")
public interface TextMapper {
    
    TextDto toDto(Text text);
    
    Text toEntity(TextDto textDto);

    void updateEntity(TextDto textDto, @MappingTarget Text text);
}
