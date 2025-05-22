package com.nomedaempresainvertido.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nomedaempresainvertido.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long>{
	
}
