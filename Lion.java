package homework;

public class Lion extends Animals{
	private String colorOfMane;
	
	public Lion(){};
	
	public void setColorOfMane(String CoM){
		this.colorOfMane=CoM;
	}
	@Override
	public String toString(){
	 	return String.format("Name: %s\tLegs: %d\t    Speed: %d\tColor of mane: %s", name, legs, speed, colorOfMane);
}
}