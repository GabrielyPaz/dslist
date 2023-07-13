package com.example.dslistjavaspring.controllers;

import com.example.dslistjavaspring.dto.GameListDTO;
import com.example.dslistjavaspring.dto.GameMinDTO;
import com.example.dslistjavaspring.services.GameListService;
import com.example.dslistjavaspring.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}