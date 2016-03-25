package homework;

public class Cats extends Animals{
	private String color;
	
	public Cats(){}
	
	public void setColor(String c){
		this.color=c;
	}
	
	public String toString(){
		return String.format("Name: %s\tLegs: %d\t    Speed: %d\tColor: %s", name, legs, speed, color);
	}


}
