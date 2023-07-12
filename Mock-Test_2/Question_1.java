package in.ineuron;

class Animal {
	public void makeSound() {
		System.out.println("The animal makes a sound.");
	}
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("The dog barks.");
	}
}

class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("The cat meows.");
	}
}

class Cow extends Animal {
	@Override
	public void makeSound() {
		System.out.println("The cow moo.");
	}
}

public class Question_1 {
	public static void main(String[] args) {

		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal cow = new Cow();
		dog.makeSound();
		cat.makeSound();
		cow.makeSound();
	}

}
