package InheritanceConcept;

class Parent {
	Parent(int age)
	{
		System.out.println("Age is:"+age);
	}
	public void eat() {
		System.out.println("Parent class eating");
	}
}

public class Child {
	public void sleep() {
		System.out.println("Parent class sleep method");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.sleep();
		Parent p = new Parent(10);
		p.eat();

	}

}
