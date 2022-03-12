package javaCampTasks.Day4.Task3.business.abstracts;


import javaCampTasks.Day4.Task3.entities.concretes.Gamer;

public interface GamerCheckService {
    boolean checkIfRealPerson(Gamer gamer);

}
