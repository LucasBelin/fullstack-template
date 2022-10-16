package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.TextDto;
import com.example.demo.model.Text;

public interface TextService {

    List<Text> getAllTexts();

    Text getText(Long id);
    
    Text createText(TextDto textDto);
    
    Text updateText(Text textDto);
    
    void deleteText(Long id);

}
