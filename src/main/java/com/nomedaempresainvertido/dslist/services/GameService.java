package com.nomedaempresainvertido.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.nomedaempresainvertido.dslist.dto.GameMinDTO;
import com.nomedaempresainvertido.dslist.entities.Game;
import com.nomedaempresainvertido.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	@GetMapping
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		 return result.stream().map(x -> new GameMinDTO(x)).toList();
		}
}
