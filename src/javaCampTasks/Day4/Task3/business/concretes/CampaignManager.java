package javaCampTasks.Day4.Task3.business.concretes;

import javaCampTasks.Day4.Task3.business.abstracts.CampaignService;
import javaCampTasks.Day4.Task3.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+ " Kampanyası eklendi.");
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+ " Kampanyası güncellendi.");

    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+ " Kampanyası silindi.");

    }
}
