package javaCampTasks.Day4.Task3.business.abstracts;

import javaCampTasks.Day4.Task3.entities.concretes.Campaign;

public interface CampaignService {
    void addCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign);
    void deleteCampaign(Campaign campaign);

}
