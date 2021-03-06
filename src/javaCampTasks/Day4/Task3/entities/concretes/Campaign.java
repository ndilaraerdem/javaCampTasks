package javaCampTasks.Day4.Task3.entities.concretes;

import javaCampTasks.Day4.Task3.entities.abstracts.Entity;

public class Campaign extends Entity {
    private String campaignName;
    private double discount;

    public Campaign() {
    }

    public Campaign(int id, String campaignName, double discount) {
        super(id);
        this.campaignName = campaignName;
        this.discount = discount;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
