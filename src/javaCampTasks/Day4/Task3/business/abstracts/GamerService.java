package javaCampTasks.Day4.Task3.business.abstracts;

import javaCampTasks.Day4.Task3.entities.concretes.Gamer;

public interface GamerService {
    void register(Gamer gamer);
    void update(Gamer gamer);
    void delete(Gamer gamer);

}
