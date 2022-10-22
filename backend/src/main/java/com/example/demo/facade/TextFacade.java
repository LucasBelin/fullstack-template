package com.example.demo.facade;

import java.util.List;

import com.example.demo.dto.TextDto;

public interface TextFacade {
    
    List<TextDto> getAllTexts();

    TextDto getText(Long id);
    
    TextDto createText(TextDto textDto);
    
    TextDto updateText(TextDto textDto);
    
    void deleteText(Long id);

}
