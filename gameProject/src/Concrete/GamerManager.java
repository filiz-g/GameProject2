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
			if(gamer.getFirstName()=="Filiz" && gamer.getLastName()=="G�l" && gamer.getDateOfBirth().getYear()==1993 && gamer.getNationalityId()=="12345678910" ) {
				
				System.out.println("E devlet sistemi ile do�rulama yap�ld� ve " + gamer.getFirstName() + " " + gamer.getLastName() + ""+ 
				" adl� oyuncu eklendi.");
			}else
			{
				System.out.println("Ge�ersiz ki�i !");
			}
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("Kullan�c� silindi :" + gamer.getFirstName()+ " "+ gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kulan�c� g�ncellendi :" + gamer.getFirstName()+ " "+ gamer.getLastName());
		
	}

}
