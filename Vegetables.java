//Create ArrayList of your favourite vegetables and perform four operations on it.
package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Vegetables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> veges = new ArrayList<String>();
		veges.add("Tommato");
		veges.add("Ladyfingure");
		veges.add("Potato");
		veges.add("Capsicum");
		veges.add("Brocoli");
		
		System.out.println("Vegetables Names Entered In List:"+veges);
		
		//Traverse list
		Iterator itr = veges.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Get Vegetable from specific position
		String str = veges.get(2);
		System.out.println("The visited vegetable is:"+str);
		
		//Modify list at specific position
		veges.set(3, "beatroot");
		System.out.println("The Modified list is:"+veges);
				
		//Remove element form list
		veges.remove(3);
		System.out.println("After Removing Element:"+veges);
	}

}
