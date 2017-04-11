package io.bridgelabz;

public class RunnableExample {

	public static void main(String[] args) {
		// Annonomus in a class Example
		Thread mythread = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Printed Inside Runnable");
			}
			
		});
		mythread.run();
		Thread myThread = new Thread(() -> System.out.println("Printed Inside Lambda Runnable"));
		myThread.run();
	}

}
