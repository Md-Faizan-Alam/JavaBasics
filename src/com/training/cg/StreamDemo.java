package com.training.cg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class StreamDemo {
	public static void main(String [] args) {
		List<String> allStrings = Arrays.asList("Anthony","Bruce","","Charlie","","David");
		
		//	Creating a Stream object of the 'allStrings' List
		Stream<String> strStream = allStrings.stream();
		List<Double> doubles = new ArrayList<>();
		
		char c ='a';
		String str = String.valueOf(c);
		
		Long l = (long)500;
		Double d = (double)l;
		//	Finding out the number of empty strings
		/*	The filter method takes a Predicate function as parameter and
			filters out the elements that return false */
		//	The count method returns the number of elements as a long value
//		long counter = strStream.filter(str->str.equals("")).count();
//		System.out.println("Total No. of empty strings is : "+counter);
		
		//	Concatenating "Name : " to every element and printing them
		/*	The map method takes a Function as parameter and replaces the
			corresponding element with the return value */
		/*	The forEach method takes a consumer as parameter
			and applies it to every element of the stream */
//		strStream.map(str->("Name : "+str)).forEach(str->System.out.println(str));
		
		//	The method collect() can be used to store the resulting stream into a new Collection
//		List<String> newStrings = strStream.map(str->("Name : "+str)).collect(Collectors.toList());
		
		/*	The anyMatch, noneMatch and allMatch operations take a Predicate as parameter
 			and return true if any one is true, none are true, and all are true, respectively. */
//		System.out.println(strStream.anyMatch(str->str.equals("")));
		
		/*	The reduce operation takes a BinaryOperator as a parameter and
		 	applies it on cosecutive values to return a single value
		 	essentially reducing the stream into a single value */
		//	The result is stored in an object of 'Optional' class
		//	The Optional class may or may not contain a value
		/*	The method ifPresent() takes a Consumer as a parameter and
			operates on the value stored in the object of Optional class if it is not null */
		/*	'System.out::println' is equivalent to
			the Consumer 'value -> System.out.println(value)' */
		Optional<String> newString = strStream.reduce((str1,str2)->str1+","+str2);
//		newString.ifPresent(System.out::println);
		String str1 = newString.orElse("");
		
		
	}
}

//	An action on a stream can have two operations done consecutively
	//	Intermediate operation (filter,map)
	//	Terminal operation (collect,count,forEach,anyMatch,noneMatch,allMatch)

//	Terminal Operation is mandatory whereas Intermediate is not











