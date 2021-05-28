package Concrete;

import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService{

	@Override
	public void add(Gamer gamer) {
		
		System.out.println("Kullan�c� eklendi :"+ gamer.getFirstName() + " " + gamer.getLastName());
		
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