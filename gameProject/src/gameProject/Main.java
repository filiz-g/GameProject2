package gameProject;

import java.time.LocalDate;

import Adapters.EDevletServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1=new Gamer(1,"Filiz","G?l",LocalDate.of(1992,01,01),"12345678910");
  
		Game game1=new Game(1,"ABC",50);
		
		Campaign campaign=new Campaign(1,"Yeni Y?l Kampanyas?",10,LocalDate.of(2021,01,01),LocalDate.of(2021,02,02));
		
		
		GamerManager gamerManager=new GamerManager(new EDevletServiceAdapter());
		gamerManager.add(gamer1);
	
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.update(campaign);

		GameManager gameManager=new GameManager();
		gameManager.delete(game1);
		
		
		
		
		
		
		
	}

}
