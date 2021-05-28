package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {

		System.out.println(campaign.getCampaignName() + " adlý kampanya eklendi.");
	}

	@Override
	public void delete(Campaign campaign) {

		System.out.println(campaign.getCampaignName() + " adlý kampanyanýn süresi dolduðu için silindi.");
	 	
	}

	@Override
	public void update(Campaign campaign) {

		System.out.println(campaign.getCampaignName() + " adlý kampanyanýn süresi uzatýldýðý için güncellendi.");
	}

}
