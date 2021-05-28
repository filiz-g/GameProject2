package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {

		System.out.println(campaign.getCampaignName() + " adl� kampanya eklendi.");
	}

	@Override
	public void delete(Campaign campaign) {

		System.out.println(campaign.getCampaignName() + " adl� kampanyan�n s�resi doldu�u i�in silindi.");
	 	
	}

	@Override
	public void update(Campaign campaign) {

		System.out.println(campaign.getCampaignName() + " adl� kampanyan�n s�resi uzat�ld��� i�in g�ncellendi.");
	}

}
