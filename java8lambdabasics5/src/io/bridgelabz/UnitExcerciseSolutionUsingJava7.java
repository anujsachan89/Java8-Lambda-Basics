package io.bridgelabz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExcerciseSolutionUsingJava7 {
	public static void main(String [] args){
		List<Person> person = Arrays.asList(
				
				new Person("Anuj","Sachan",26),
				new Person("Rahul","Yahoo",23),
				new Person("Foo","Fqq",31),
				new Person("Woo","Ater",52),
				new Person("mail","Hello",78),
				new Person("Google","Chotu",89)
				
				
				);
		
		//Step1:  Sort list by last Name
		Collections.sort(person, new Comparator<Person>(){

			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		//Step2:  Create an mthod that prints all elements in the list
		
		printAll(person);
		
		
		
		//Step3:  Create an method that prints all people that have last name begining with C
		
		printLastNameBeginningWithC(person);
		
	}

	private static void printLastNameBeginningWithC(List<Person> person) {
		// TODO Auto-generated method stub
		for(Person p:person){
			if(p.getLastName().startsWith("C")){
				System.out.println(p);
			}
		}
	}

	private static void printAll(List<Person> person) {
		// TODO Auto-generated method stub
		for(Person p:person){
			System.out.println(p);
		}
	}
	
}
