package com.lmsDay6;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;

public class ReverseArrayList {

	    public static void main(String[] args) {
	        // Create a list of strings
	        ArrayList<String> myList = new ArrayList<>();
	        myList.add("a");
	        myList.add("b");
	        myList.add("c");
	        myList.add("d");

	        // Print the original list
	        System.out.println("Original List: " + myList);

	        // Reverse the list
	        Collections.reverse(myList);

	        // Print the reversed list
	        System.out.println("Reversed List: " + myList);
	    }
	}