package oop;

class Person {
	
	
	//creating a blueprint
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking..");
	};
	
	void eat(){
		System.out.println(name +" is eating..");
		
	};
	
	void sleep(){
		System.out.println(name + " is sleeping");
	};

}

public class Demo {

	public static void main(String[] args) {
		
		//Instantiating an object
		Person person1 = new Person();
		
		//defining the properties of the object
		 person1.email = "joe.test@gmail.com";
		 person1.name = "Joe";
		 person1.phone = "568657586";
		 
		 //this is abstraction, where we we only access the elements that are only applicable to us.
		 person1.sleep();
		 person1.eat();
		
		/*
		//person
		
		//variables
		String name = "Joe";
		String email = "joe@testemail.com";
		String phone = "0420272616";
		
		//activity, behaviour
		System.out.println("Eating..");
		System.out.println("Walking.....");
		
		//What if we were to do this for another person?
		String name1 = "Sarah";
		String email1 = "s@testemail.com";
		String phone1= "0420272616";
		
		//activity, behaviour
		System.out.println("Eating..");
		System.out.println("Walking.....");
		
		//what about binding the attributes and the properties together?
	}
		//Lets enhance using functions to minimize code!!
		static void walking(String name) {
			System.out.println(name +" is walking..");
		}
		
*/
	}	

}
