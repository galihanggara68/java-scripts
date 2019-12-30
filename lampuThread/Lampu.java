package lampuThread;

public class Lampu {
	private boolean isOn = false;
	
	public boolean switchLamp(){
		// Kalau mati jadi hidup, kalau hidup jadi mati
		isOn = !isOn;
		return isOn;
	}
}
