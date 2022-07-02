package com.example.demo.service;

import com.example.demo.dto.TextDto;
import com.example.demo.model.Text;

public interface TextService {
    
    Text getText(Long id);
    
    Text createText(TextDto textDto);
    
    Text updateText(Text textDto);
    
    void deleteText(Long id);

}
