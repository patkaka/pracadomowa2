package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Kitty {
public static void main(String args[]){
	
	//Set
		String Zoo[]={"Cats","Lion","Tiger"};
		Set<String> species = new HashSet<String>();
		for(String z: Zoo){
			species.add(z);
			}
		
		System.out.println("Zoo:");
		System.out.println(species+"\n");
		
	//tablica
	Cats kitty[]=new Cats[3];
	int i =0;
	for (Cats cat:kitty){
		cat= new Cats();
		cat.setLegs(4);
		cat.setSpeed(10);
		kitty[i++]=cat;
	}
	kitty[0].setName("Skarpeta");
	kitty[0].setColor("Red");
	kitty[1].setName("Mas³o");
	kitty[1].setColor("White");
	kitty[2].setName("Œmieæ");
	kitty[2].setColor("Black");
	System.out.println("Cats:");
	for (Cats cat: kitty){
		System.out.println(cat);
	}
	
		//lista 1.
	List <Tiger> tigerList = new ArrayList<Tiger>(3);
	for (i=0;i<=2;i++){
		Tiger tiger = new Tiger();
		tiger.setLegs(4);
		tiger.setSpeed(100);
		tiger.setLengthOfClaws(10);
		tigerList.add(tiger);
	}
	tigerList.get(0).setName("Mruczek");
	tigerList.get(1).setName("Koteczek");
	tigerList.get(2).setName("Kicia");
	
	System.out.println("Tigers:");
	for (Tiger tiger: tigerList){
		System.out.println(tiger);
	}
	
	//lista2
	List<Lion> lionsList= new LinkedList<Lion>();
	for(i=0;i<2;i++){
		Lion lion=new Lion();
		lion.setLegs(4);
		lion.setSpeed(99);
		lion.setColorOfMane("gold");
		lionsList.add(lion);
	}
	lionsList.get(0).setName("Simba");
	lionsList.get(1).setName("Mufasa");
	lionsList.add(2, new Lion());
	lionsList.get(2).setName("Skaza");
	lionsList.get(2).setLegs(4);
	lionsList.get(2).setSpeed(70);
	lionsList.get(2).setColorOfMane("black");
	
	System.out.println("Lions:");
	for(Lion lion: lionsList){
	System.out.println(lion);
	}
	
	//Map
	Map <Integer, Lion> cagesNumber=new HashMap<>();
	cagesNumber.put(1, lionsList.get(0));
	cagesNumber.put(2, lionsList.get(1));
	cagesNumber.put(3, lionsList.get(2));
	
	Scanner number=new Scanner(System.in);
	System.out.println("Enter the number of cage");
	int choice=number.nextInt();
	if (choice >3){
		System.out.println("This cage is empty");
	}
	System.out.println(cagesNumber.get(choice -1));
	
}
}
