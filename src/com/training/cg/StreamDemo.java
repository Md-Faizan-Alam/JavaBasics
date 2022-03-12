package com.training.cg;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamDemo {
	public static void main(String [] args) {
		List<Integer> allNum = Arrays.asList(0,2,4,6,1,7,3,5);
		Stream<Integer> stream = allNum.stream();
		stream.filter(i->i%2==0).reduce((a,b)->a+b).ifPresent(System.out::println);
	}
}
