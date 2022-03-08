package com.training.cg;

public class FilterNum {
	public static void main(String[] args) {
		int[] a = new int[] {3,5,2,7,9,1,4,6};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				System.out.println(a[i]);
			}
		}
	}
}
