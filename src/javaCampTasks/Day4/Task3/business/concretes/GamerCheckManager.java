package javaCampTasks.Day4.Task3.business.concretes;

import javaCampTasks.Day4.Task3.business.abstracts.GamerCheckService;
import javaCampTasks.Day4.Task3.entities.concretes.Gamer;

public class GamerCheckManager implements GamerCheckService {
    @Override
    public boolean checkIfRealPerson(Gamer gamer) {
        return true;
    }
}
