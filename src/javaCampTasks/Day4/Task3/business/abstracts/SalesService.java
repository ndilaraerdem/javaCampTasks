package javaCampTasks.Day4.Task3.business.abstracts;

import javaCampTasks.Day4.Task3.entities.concretes.Campaign;
import javaCampTasks.Day4.Task3.entities.concretes.Game;
import javaCampTasks.Day4.Task3.entities.concretes.Gamer;

public interface SalesService {
    void sell(Game game, Gamer gamer, Campaign campaign);
}
