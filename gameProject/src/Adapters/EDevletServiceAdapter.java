package Adapters;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class EDevletServiceAdapter implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		System.out.println("E-devlet sisteminde bu kiþi mevcuttur.");
		return true;
	}

}
