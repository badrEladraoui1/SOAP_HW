package com.example.SoapHomeWork.services;

import com.example.SoapHomeWork.entities.Game;

import java.util.List;

public interface GameService {

     Game getGame(Integer id);
     List<Game> getAllGames();
     void addGame(Game game);
     void updateGame(Integer id , Game game);
     void deleteGame(Integer id);

}
