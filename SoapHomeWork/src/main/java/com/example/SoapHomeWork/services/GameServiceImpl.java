package com.example.SoapHomeWork.services;

import com.example.SoapHomeWork.entities.Game;
import com.example.SoapHomeWork.repositpries.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService{

    GameRepository gameRepository;

    @Autowired
    public GameServiceImpl(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    @Override
    public Game getGame(Integer id) {
        Optional<Game> optionalGame = this.gameRepository.findById(id);
        return optionalGame.orElse(null);
    }

    @Override
    public List<Game> getAllGames() {
        return this.gameRepository.findAll();
    }


    @Override
    public void addGame(Game game) {
        this.gameRepository.save(game);
    }

    @Override
    public void updateGame(Integer id , Game game) {
        Optional<Game> optionalGame = this.gameRepository.findById(id);
        Game theGame = null;
        if(optionalGame.isPresent())  theGame = optionalGame.get();

        assert theGame != null;
        theGame.setName(game.getName());
        theGame.setPrice(game.getPrice());
        theGame.setReleaseDate(game.getReleaseDate());

        this.gameRepository.save(theGame);
    }

    @Override
    public void deleteGame(Integer id) {
        this.gameRepository.deleteById(id);
    }
}
