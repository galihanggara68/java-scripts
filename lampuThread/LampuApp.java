package lampuThread;

public class LampuApp {
	public static void main(String[] args){
		Lampu lampu = new Lampu();
		for(int i = 0; i < 20; i++){
			new Switcher("Switch 1", lampu).start();
			new Switcher("Switch 2", lampu).start();
		}
	}
}
