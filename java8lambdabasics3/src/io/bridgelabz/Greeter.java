package io.bridgelabz;

public class Greeter {

	public void greet (Greeting greeting){
		greeting.perform();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter = new Greeter();
		Greeting lambdaGreeting = ()-> System.out.println("Hello World");
		
		
		
		
		Greeting innerClassGreeting = new Greeting(){
			public void perform(){
				System.out.println("Hello World");
			}
		};
		greeter.greet(innerClassGreeting);
		greeter.greet(lambdaGreeting);
	}

}
