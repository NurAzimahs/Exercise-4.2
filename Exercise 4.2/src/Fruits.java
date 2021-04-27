
public class Fruits {

	String name, colour, taste;
	double price, weight;
	
	public Fruits(String name) {
		this.name = name;
		System.out.println("Fruit constructor is invoked");
		
	}
}

class Apple extends Fruits{
	public Apple(String name, double price) {
		super(name);
		this.price = price;
		
		System.out.println(this.name + " constructor is invoke");
		System.out.println("Price per kg is: RM" + this.price);
		
	}
}

class redApple extends Apple{
	public redApple(String name, String colour, double price) {
		super(name,price);
		this.colour = colour; 
		
		System.out.println("Colour is: " + this.colour);
		
	}
}

class greenApple extends Apple{
	public greenApple(String name, String colour, double price) {
		super(name,price);
		this.colour = colour; 
		
		System.out.println("Colour is: " + this.colour);
	}
}

class Durian extends Fruits{
	public Durian(String name, double price, double weight) {
		super(name);
		this.price = price; 
		this.weight = weight;
		
		System.out.println(this.name + " constructor is invoke");
		System.out.println("Price per kg is: RM" + this.price);
		System.out.println("Weight is: " + this.weight +"kg"); 
	}
}

class MusangKing extends Durian{
	public MusangKing(String name, double price, double weight, String colour) {
		super(name,price,weight);
		this.colour = colour;

		System.out.println("Colour is: " + this.colour);
	}
}

class D24 extends Durian{
	public D24(String name, double price, double weight, String colour) {
		super(name,price,weight);
		this.colour = colour;
		
		System.out.println("Colour is: " + this.colour);
	}
} 

class Mango extends Fruits{
	public Mango(String name, double price, double weight) {
		super(name);
		this.price = price;
		this.weight = weight; 
		
		System.out.println(this.name + " constructor is invoke");
		System.out.println("Price per kg is: RM" + this.price);
		System.out.println("Weight is: " + this.weight + "kg");
	}
}

class yellowMango extends Mango{
	public yellowMango(String name, double price, double weight, String colour, String taste) {
		super(name,price,weight);
		this.colour = colour;
		this.taste = taste;
		
		System.out.println("Colour is: " + this.colour);
		System.out.println("Taste is: " + this.taste);
	}
}

class greenMango extends Mango{
	public greenMango(String name, double price, double weight, String colour, String taste) {
		super(name,price,weight);
		this.colour = colour;
		this.taste = taste;
		
		System.out.println("Colour is: " + this.colour);
		System.out.println("Taste is: " + this.taste);
		
	}
}

