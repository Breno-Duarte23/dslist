package com.devsuperior.dsList.repositories;

import com.devsuperior.dsList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
