package javaCampTasks.Day4.Task3.api;

import javaCampTasks.Day4.Task3.business.abstracts.GamerService;
import javaCampTasks.Day4.Task3.business.concretes.GameManager;
import javaCampTasks.Day4.Task3.business.concretes.GamerCheckManager;
import javaCampTasks.Day4.Task3.business.concretes.GamerManager;
import javaCampTasks.Day4.Task3.business.concretes.SalesManager;
import javaCampTasks.Day4.Task3.entities.concretes.Campaign;
import javaCampTasks.Day4.Task3.entities.concretes.Game;
import javaCampTasks.Day4.Task3.entities.concretes.Gamer;

public class Main {
    public static void main(String[] args) {
        Game game1 = new Game(1,"GTA Vice City",15);
        Gamer gamer1 = new Gamer(1,"ndilaraerdem","Dilara","ERDEM","38927423894");
        Campaign campaign1 = new Campaign(1,"Nostaljik Oyun İndirimi",20);
        GamerService gamerService = new GamerManager(new GamerCheckManager());
        GameManager gameManager = new GameManager();
        gameManager.newGame(game1);
        gamerService.register(gamer1);
        SalesManager salesManager = new SalesManager();
        salesManager.sell(game1,gamer1,campaign1);
    }
}
