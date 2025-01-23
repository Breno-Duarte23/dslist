package com.devsuperior.dsList.controllers;

import com.devsuperior.dsList.dto.GameDTO;
import com.devsuperior.dsList.dto.GameListDTO;
import com.devsuperior.dsList.dto.GameMinDTO;
import com.devsuperior.dsList.entities.GameList;
import com.devsuperior.dsList.sevices.GameListService;
import com.devsuperior.dsList.sevices.GameService;
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
    public List<GameListDTO> findALl(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
