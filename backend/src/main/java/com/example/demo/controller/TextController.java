package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TextDto;
import com.example.demo.facade.TextFacade;




@RestController
@RequestMapping("/api/text")
public class TextController {
    
    @Autowired
    private TextFacade textFacade;

    @GetMapping
    public List<TextDto> getAllTexts() {
        return textFacade.getAllTexts();
    }

    @GetMapping(value="/{textId}")
    public TextDto getText(@PathVariable Long textId) {
        return textFacade.getText(textId);
    }

    @PostMapping
    public TextDto createText(@RequestBody TextDto textDto) {
        return textFacade.createText(textDto);
    }
    
    @PutMapping()
    public TextDto updateText(@RequestBody TextDto textDto) {        
        return textFacade.updateText(textDto);
    }

    @DeleteMapping(value="/{textId}")
    public void deleteText(@PathVariable Long textId) {
        textFacade.deleteText(textId);
    }
}
