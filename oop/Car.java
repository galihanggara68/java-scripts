package oop;

public class Car {
	private String mesin;
	private String roda;
	private String stir;
	private String merk;
	private int posisi;
	
	public double getKm(){
		return (this.posisi/1000);
	}
	
	public String getDetails(){
		return "Merk : " + this.merk + " Mesin : " + this.mesin;
	}
	
	public String maju(int meter, String arah){
		this.posisi += meter;
		System.out.println("Mobil Maju Sejauh " + this.posisi + "m ke arah " + arah);
		return this.posisi + "m ke arah " + arah;
	}
	
	public void mundur(){
		System.out.println("Mobil Mundur");
	}
	
	public void berhenti(){
		System.out.println("Mobil Berhenti");
	}
	
	public void tabrak(Car car){
		System.out.println(this.merk + " menabrak " + car.getMerk());
	}
	
	// Getter / Setter
	public String getMesin(){
		return mesin;
	}
	
	public void setMesin(String mesin){
		this.mesin = mesin;
	}

	public String getRoda() {
		return roda;
	}

	public void setRoda(String roda) {
		this.roda = roda;
	}

	public String getStir() {
		return stir;
	}

	public void setStir(String stir) {
		this.stir = stir;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public int getPosisi() {
		return posisi;
	}

	public void setPosisi(int posisi) {
		this.posisi = posisi;
	}
	
}
