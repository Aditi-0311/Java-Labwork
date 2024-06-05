package com.example;

import java.util.Scanner;

public class HomeLoan implements LoanCal
{
    double prinamt,loanamt,roi=8.5;
    int year;
    Scanner sc = new Scanner(System.in);

	@Override
	public void acceptpriamt() {
		// TODO Auto-generated method stub
		System.out.println("enetr the pricipal amount:");
		prinamt = sc.nextDouble();
		System.out.println("enetr the year :");
		year = sc.nextInt();
	}
	public void display() 
	{
		loanamt = (prinamt*roi*year)/100;
		System.out.println("the home loan is a :"+loanamt);
	}
	public static void main(String args[])
	{
		HomeLoan h1 = new HomeLoan();
		h1.acceptpriamt();
		h1.display();
	}
      
}