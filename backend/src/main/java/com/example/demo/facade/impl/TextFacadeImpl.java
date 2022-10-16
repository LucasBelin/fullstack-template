package com.example.demo.facade.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.TextDto;
import com.example.demo.facade.TextFacade;
import com.example.demo.mapper.TextMapper;
import com.example.demo.model.Text;
import com.example.demo.service.TextService;

@Service
public class TextFacadeImpl implements TextFacade {
    
    private TextMapper textMapper;

    private TextService textService;

    public TextFacadeImpl(final TextMapper textMapper, final TextService textService) {
        this.textMapper = textMapper;
        this.textService = textService;
    }

    @Override
    public List<TextDto> getAllTexts() {
        return textMapper.mapToTextDtoList(textService.getAllTexts());
    }

    @Override
    public TextDto getText(final Long textId) {
        Text text = textService.getText(textId);
        return textMapper.toDto(text);
    }

    @Override
    public TextDto createText(TextDto textDto) {
        Text text = textService.createText(textDto);
        return textMapper.toDto(text);
    }

    @Override
    public TextDto updateText(Long id, TextDto textDto) {
        Text text = textService.getText(id);
        textMapper.updateEntity(textDto, text);
        Text updatedText = textService.updateText(text);
        return textMapper.toDto(updatedText);
    }

    @Override
    public void deleteText(Long id) {
        textService.deleteText(id);
    }

}
