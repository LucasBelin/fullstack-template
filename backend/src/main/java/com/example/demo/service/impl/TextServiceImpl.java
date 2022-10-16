package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.TextDto;
import com.example.demo.exception.NotFoundException;
import com.example.demo.mapper.TextMapper;
import com.example.demo.model.Text;
import com.example.demo.repository.TextRepository;
import com.example.demo.service.TextService;

import static com.example.demo.exception.ExceptionMessageConstants.TEXT_ID_NOT_FOUND;

import java.util.List;;

@Service
public class TextServiceImpl implements TextService {
    
    @Autowired
    private TextRepository textRepository;

    @Autowired
    private TextMapper textMapper;

    @Override
    public List<Text> getAllTexts() {
        return textRepository.findAll();
    }

    @Override
    public Text getText(Long id) {
        return textRepository.findById(id).orElseThrow(() -> new NotFoundException(TEXT_ID_NOT_FOUND));
    }

    @Override
    public Text createText(TextDto textDto) {
        return textRepository.save(textMapper.toEntity(textDto));
    }

    @Override
    public Text updateText(Text text) {
        return textRepository.save(text);
    }

    @Override
    public void deleteText(Long id) {
        textRepository.findById(id).orElseThrow(() -> new NotFoundException(TEXT_ID_NOT_FOUND));
        textRepository.deleteById(id);
    }

}
