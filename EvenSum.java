package com.lmsDay6;

	import java.util.ArrayList;
	import java.util.List;

	public class EvenSum {
	    public static void main(String[] args) {
	        // Create an ArrayList of integers
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(25);
	        numbers.add(32);
	        numbers.add(47);
	        numbers.add(8);
	        
	        // Calculate the sum of even numbers
	        int sumOfEvens = 0;
	        for (int value : numbers) {
	            if (value % 2 == 0) {
	                sumOfEvens += value;
	            }
	        }
	        
	        // Print the sum of even numbers
	        System.out.println("Sum of even numbers: " + sumOfEvens);
	    }
	}