package thread;

import java.util.List;

public class RFIDThread extends Thread{
	private List<User> resource;
	private User user;
	
	public RFIDThread(String name, List<User> sharedResource){
		super(name);
		this.resource = sharedResource;
	}
	
	public void run(){
		synchronized(resource){
			System.out.println(this.getName()+"-"+user.getName());
			resource.add(user);
		}
	}
	
	public void tapped(User user){
		this.user = user;
		this.start();
	}
}
