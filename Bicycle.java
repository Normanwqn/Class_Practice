import java.util.Scanner;
public class Bicycle {
	String colour;
	int milage;
	int price;
	
	public static void main(String[] args){
		Bicycle a = new Bicycle();
		Scanner inp = new Scanner(System.in);
		Scanner ii = new Scanner(System.in);
		System.out.println("Please estimate the milage of your bike in km:");
		a.milage = inp.nextInt();
		System.out.println("Please input the colour of your bike:");
		a.colour = ii.nextLine();
		System.out.println("Please input your price for the bike:");
		a.price = inp.nextInt();
		System.out.println(a.price);
		a.printSummary();
		Dog b = new Dog();
		System.out.println("Please input the mass of your dog");
		b.mass = inp.nextInt();
		b.printmass();
	}
	public void printSummary() {
		System.out.println("The estimated milage of your bike is " + milage + ".");
		System.out.println("The colour of your car is " + colour + ".");
		System.out.println("The price for the bike is " + price + ".");
	}
}
