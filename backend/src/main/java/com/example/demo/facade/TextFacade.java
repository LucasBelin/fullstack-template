package com.example.demo.facade;

import com.example.demo.dto.TextDto;

public interface TextFacade {
    
    TextDto getText(Long id);
    
    TextDto createText(TextDto textDto);
    
    TextDto updateText(Long id, TextDto textDto);
    
    void deleteText(Long id);

}
