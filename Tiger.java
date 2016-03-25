package homework;



public class Tiger extends Animals {
private int lengthOfClaws;

	public Tiger(){};
	
	public void setLengthOfClaws(int LoC){
		this.lengthOfClaws=LoC;
	}
	@Override
	public String toString(){
	 	return String.format("Name: %s\tLegs: %d\t    Speed: %d\tLength of claws: %s", name, legs, speed, lengthOfClaws);
}
}