package inheritance;

public class Vehicle {
	String color;
	
	public static void main(String[] args) {
		Bike b = new Bike("Red","BMW",50000);
		System.out.println("------------Bike-----------");
		System.out.println(b.Brand);
		System.out.println(b.color);
		System.out.println(b.price);
		
		Car c = new Car("Black","Maserati",10000000);
		System.out.println("------------Car------------");
		System.out.println(c.Brand);
		System.out.println(c.color);
		System.out.println(c.price);
		
	}
}

class Bike extends Vehicle{
	public String Brand;
	public int price;
	
	Bike(String color, String Brand, int price){
		this.color = color;
		this.Brand = Brand;
		this.price = price;
	}
}

class Car extends Vehicle{
	public String Brand;
	public int price;
	
	Car(String color, String Brand, int price){
		this.color = color;
		this.Brand = Brand;
		this.price = price;
	}
}