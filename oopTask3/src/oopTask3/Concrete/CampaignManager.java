package oopTask3.Concrete;

import oopTask3.Abstract.CampaignService;
import oopTask3.Entitites.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " sisteme eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " guncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " sistemden silindi.");
		
	}

}
