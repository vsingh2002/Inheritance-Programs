package InheritanceConcept;

public class Dog extends Animal {
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d.age);
		d.eat();
		d.run();
		d.sleep();
	}

}
