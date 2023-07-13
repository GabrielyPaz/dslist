package com.example.dslistjavaspring.services;

import com.example.dslistjavaspring.dto.GameDTO;
import com.example.dslistjavaspring.dto.GameMinDTO;
import com.example.dslistjavaspring.entities.Game;
import com.example.dslistjavaspring.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO>dto = result.stream().map(x -> new GameMinDTO(x)).toList();
      return dto;
    }
}
