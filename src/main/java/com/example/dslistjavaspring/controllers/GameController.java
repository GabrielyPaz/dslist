package com.example.dslistjavaspring.controllers;
import java.util.List;

import com.example.dslistjavaspring.dto.GameDTO;
import com.example.dslistjavaspring.dto.GameMinDTO;
import com.example.dslistjavaspring.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dslistjavaspring.entities.Game;

@RestController
@RequestMapping(value = "games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        GameDTO result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
