package javaCampTasks.Day4.Task3.business.concretes;

import javaCampTasks.Day4.Task3.business.abstracts.SalesService;
import javaCampTasks.Day4.Task3.entities.concretes.Campaign;
import javaCampTasks.Day4.Task3.entities.concretes.Game;
import javaCampTasks.Day4.Task3.entities.concretes.Gamer;

public class SalesManager implements SalesService {
    @Override
    public void sell(Game game, Gamer gamer, Campaign campaign) {
        System.out.println(game.getGameName() +" oyunu "+ gamer.getUsername() + " kullanıcı adlı üyeye "+ campaign.getCampaignName()+ " kampanyası ile satıldı.");
    }
}
