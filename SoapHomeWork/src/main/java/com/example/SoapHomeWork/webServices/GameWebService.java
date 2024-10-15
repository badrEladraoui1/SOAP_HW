package com.example.SoapHomeWork.webServices;

import com.example.SoapHomeWork.entities.Game;
import com.example.SoapHomeWork.services.GameService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService(name = "GameWS")
public class GameWebService {

    GameService gameService;

    public GameWebService(GameService gameService){
        this.gameService  = gameService;
    }

    @WebMethod(operationName = "getAllGames")
    public List<Game> getAllGames(){
        return this.gameService.getAllGames();
    }

    @WebMethod(operationName = "getGameById")
    public Game getGameById(@WebParam(name = "id") Integer id){
        return this.gameService.getGame(id);
    }

    @WebMethod(operationName = "addGame")
    public void addGame( @WebParam(name = "game") Game game){
        this.gameService.addGame(game);
    }

    @WebMethod(operationName = "updateGame")
    public void updateGame(@WebParam(name = "id") Integer id ,  @WebParam(name = "game") Game game){
        this.gameService.updateGame(id , game);
    }

    @WebMethod(operationName = "deleteGameById")
    public void deleteGameById(@WebParam(name = "id") Integer id){
         this.gameService.deleteGame(id);
    }

}
