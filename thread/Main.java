package thread;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		List<User> sharedResource = new ArrayList<User>();
		RFIDThread stall;
		RFIDThread deResto;
		RFIDThread deBuffet;
		
		for(int i = 0; i < 50; i++){
			User user = new User();
			user.setCardId(i+"");
			user.setName("User "+i);
			
			stall = new RFIDThread("Stall", sharedResource);
			deResto = new RFIDThread("deResto", sharedResource);
			deBuffet = new RFIDThread("deBuffet", sharedResource);
			stall.tapped(user);
			deResto.tapped(user);
			deBuffet.tapped(user);
		}
		
//		
//		User ian = new User();
//		ian.setCardId("01");
//		ian.setName("Ian Cardilano");
//		
//		User galih = new User();
//		galih.setCardId("02");
//		galih.setName("Galih Ginanjar");
//		
//		stall.tapped(ian);
//		deResto.tapped(galih);
//		
//		System.out.println(sharedResource.get(0).getCardId());
	}
}
