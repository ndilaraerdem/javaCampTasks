package javaCampTasks.Day4.Task3.business.abstracts;

import javaCampTasks.Day4.Task3.entities.concretes.Game;

public interface GameService {
    void newGame(Game game);
    void updateGame(Game game);
    void deleteGame(Game game);
}
