package thread;

public class TriangleThread extends Thread {
	private int orientation;
	
	public TriangleThread(int orientation) {
		this.orientation = orientation;
	}
	
	@Override
	public void run(){
		for(int i = 0; i < 10; i ++){
			if(orientation != 1){
				for(int space = 10; space > i; space--){
					System.out.print(" ");
				}
			}
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void setOrientation(int o){
		this.orientation = o;
	}
}
