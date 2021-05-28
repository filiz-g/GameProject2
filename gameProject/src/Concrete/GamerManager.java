package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{

	
		GamerCheckService gamerCheckService;
		
		public GamerManager(GamerCheckService gamerCheckService) {
			this.gamerCheckService=gamerCheckService;
		}
		@Override
		public void add(Gamer gamer) {
			if(gamer.getFirstName()=="Filiz" && gamer.getLastName()=="Gül" && gamer.getDateOfBirth().getYear()==1993 && gamer.getNationalityId()=="12345678910" ) {
				
				System.out.println("E devlet sistemi ile doðrulama yapýldý ve " + gamer.getFirstName() + " " + gamer.getLastName() + ""+ 
				" adlý oyuncu eklendi.");
			}else
			{
				System.out.println("Geçersiz kiþi !");
			}
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Kullanýcý silindi :" + gamer.getFirstName()+ " "+ gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kulanýcý güncellendi :" + gamer.getFirstName()+ " "+ gamer.getLastName());
		
	}

}
