package com.example.dslistjavaspring.services;

import com.example.dslistjavaspring.dto.GameDTO;
import com.example.dslistjavaspring.dto.GameListDTO;
import com.example.dslistjavaspring.dto.GameMinDTO;
import com.example.dslistjavaspring.entities.GameList;
import com.example.dslistjavaspring.repository.GameRepository;
import com.example.dslistjavaspring.repository.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO>dto = result.stream().map(x -> new GameListDTO(x)).toList();
      return dto;
    }
}
