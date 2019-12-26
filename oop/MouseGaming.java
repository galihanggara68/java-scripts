package oop;


// Overload -> Method Overloading
// Overriding
public class MouseGaming extends Mouse{
	private int dpi;
	
	public void dpiClick(){
		dpi +=800;
	}
	
	public int getDpi(){
		return dpi;
	}
}
