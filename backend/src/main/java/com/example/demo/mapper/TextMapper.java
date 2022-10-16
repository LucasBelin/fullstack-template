package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.example.demo.dto.TextDto;
import com.example.demo.model.Text;

@Mapper(componentModel = "spring")
public interface TextMapper {
    
    TextDto toDto(Text text);
    
    Text toEntity(TextDto textDto);

    void updateEntity(TextDto textDto, @MappingTarget Text text);

    List<TextDto> mapToTextDtoList(List<Text> allTexts);
}
