package inheritance;

public class Animal {
	String type;

    public static void main(String[] args) {

        Dog d = new Dog("Mammal", "Labrador", "Bruno", 5);

        System.out.println("-----------Dog-----------");
        System.out.println(d.name);
        System.out.println(d.type);
        System.out.println(d.breed);
        System.out.println(d.age);
    }
}

class Mammal extends Animal {
    String breed;
    
    Mammal(){
    	
    }

    Mammal(String type, String breed) {
        this.type = type;     
        this.breed = breed;
    }
}

class Dog extends Mammal {
    String name;
    int age;

    Dog(String type, String breed, String name, int age) {
        this.type = type;     
        this.breed = breed;   
        this.name = name;
        this.age = age;
    }
}
