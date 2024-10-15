package org.example;

import proxy.Game;
import proxy.GameWS;
import proxy.GameWebServiceService;

import java.util.Date;
import java.util.List;

public class GameClientWS {
    public static void main(String[] args) {
        GameWS proxy = new GameWebServiceService().getGameWSPort();

        System.out.println("------------------");
        System.out.println("LIST OF GAMES : : :");
        List<Game> games =  proxy.getAllGames();
        games.forEach(agame -> {
            System.out.println(agame.getName());
            System.out.println(agame.getPrice());
        });
        System.out.println("------------------");
        System.out.println("A GAME : : :");
        Game game  = proxy.getGameById(1);
        System.out.println(game.getName());
        System.out.println(game.getPrice());

        System.out.println("------------------");
        System.out.println("ADD GAME : : :");
//        Game game1 = new Game("spider man",700.00,new Date()); // TODO : FIX THE ALLARGS CONSTRUCTOR NOT WORKING

        System.out.println("------------------");
        System.out.println("UPDATE GAME : : :");
//        proxy.updateGame(1,new Game()); // TODO : FIX THE ALLARGS CONSTRUCTOR NOT WORKING

        System.out.println("------------------");
        System.out.println("DELETE GAME : : :");
        proxy.deleteGameById(3);
    }
}
