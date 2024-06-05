package com.example;
import java.util.*;

public class GoldLoan implements LoanCal {
	int inputingram, year, roi=12,loanAmount,totalCost,actualLoan;
	Scanner sc = new Scanner(System.in);

	@Override
	public void acceptpriamt() {
		// TODO Auto-generated method stub
		System.out.println("Enter Gold in Grams");
		inputingram = sc.nextInt();
		totalCost=6000*inputingram;
		actualLoan=(totalCost*80)/100;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Your sanctioned gold loan is:"+actualLoan);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoldLoan g = new GoldLoan();
		g.acceptpriamt();
		g.display();
	}

}
