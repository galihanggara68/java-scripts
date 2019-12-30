package lampuThread;

public class Switcher extends Thread{
	private Lampu lampu;
	
	public Switcher(String name, Lampu lampu){
		super(name);
		this.lampu = lampu;
	}
	
	public void run(){
		synchronized (lampu) {
			System.out.println("Switching From " + this.getName());
			System.out.println("Lampu State : " + lampu.switchLamp());
		}
	}
}
