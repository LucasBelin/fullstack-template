package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TextDto;
import com.example.demo.facade.TextFacade;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/text")
public class TextController {
    
    @Autowired
    private TextFacade textFacade;

    @GetMapping(value="/{textId}")
    public TextDto getText(@PathVariable Long textId) {
        return textFacade.getText(textId);
    }

    @PostMapping
    public TextDto createText(@RequestBody TextDto textDto) {
        return textFacade.createText(textDto);
    }
    
    @PutMapping(value="/{textId}")
    public TextDto updateText(@PathVariable Long textId, @RequestBody TextDto textDto) {        
        return textFacade.updateText(textId, textDto);
    }

    @DeleteMapping(value="/{textId}")
    public void deleteText(@PathVariable Long textId) {
        textFacade.deleteText(textId);
    }
}
