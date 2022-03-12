package com.training.cg;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdaDemo {
	public static void main(String[] args) {
		float [] num = new float[] {2,3.5f,6,8.2f};
		
		// Using the 'FuncInter' Functional Interface to implement a function
		// The below expression is known as 'Lambda Expression'
		DemoInterface d = (arr)->{
			float sum = 0;
			for(float f:arr) {
				sum += f;
			}
			sum /= arr.length;
			System.out.println("The average is : "+sum);
		};
		
		// Calling the function
		d.average(num);
		
//		Predefined Functional Interfaces in Java
		
		// Function -> Takes a single parameter and returns a single value
		Function<Integer,String> f = (number) ->{
			return "The number is : "+number;
		};
		System.out.println(f.apply(5));
		
		
		// Predicate -> Takes a single parameter and returns a boolean
		Predicate<Integer> p = (number) ->{
			return (number>5);
		};
		System.out.println(p.test(10));
		
		
		// UnaryOperator -> Takes a single parameter and returns a single value of the same type
		UnaryOperator<String> u = (name)->{
			return "Hello " + name;
		};
		System.out.println(u.apply("Anthony"));
		
		
		// BinaryOperator -> Takes two parameters of the same type and returns a single value of the same type
		BinaryOperator<Integer> b = (num1,num2)->{
			return num1+num2;
		};
		System.out.println(b.apply(13, 27));
		
		
		// Supplier -> Takes no parameter and returns a single value
		Supplier<Integer> s = ()->{
			return (int)(Math.random()*100);
		};
		System.out.println(s.get());
		
		
		// Consumer -> Takes a single parameter and returns no value
		Consumer<Integer> c = (number)->{
			System.out.println("The number is : "+number);
		};
		c.accept(53);
	
	}
}
