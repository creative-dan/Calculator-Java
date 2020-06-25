
public class Polymorph {

	public static void main(String[] args) {
		//new Animal();
		Cat cat = new Cat();	 	//object of subclass cat
		Dog dog = new Dog();		//object of subclass Dog			
		short a = dog.animalAge();
		short b = cat.animalAge();
		System.out.println("Cat\'s age is " + a);
		System.out.println("Dog\'s age is " + b);
		System.out.println("Combined age of cat and dog is " + (a + b));
	}
}

class Animal {   // superclass
	short animalAge() {
		return 0;
	}
}

class Cat extends Animal {	//subclass inherits Animal
	short animalAge() {
		return 12;
	}
}

class Dog extends Animal { // subclass inherits Animal
	short animalAge() {
		return 8;
	}
}