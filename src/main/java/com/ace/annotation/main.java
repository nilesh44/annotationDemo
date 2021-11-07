package com.ace.annotation;

public class main {

	public static void main(String[] args) {
		 Person person = new Person("soufiane", "cheouati", "34","pune");
		    ObjectToJsonConverter serializer = new ObjectToJsonConverter(); 
		    String jsonString = serializer.convertToJson(person);
		    System.out.println(jsonString);
	}
}
