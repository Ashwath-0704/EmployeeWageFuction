package Emplywage;

import java.util.*;

public class EmplyWage {

	static int present, absent, Part_Time_days1;// (UC1 to UC3)
	static int Prasent1, absent1, Partime1; // (UC4 to UC7)

	final static int Fixed_hrs = 8; // can not be changed
	final static int Part_Time_Fixed_hrs = 4; // can not be changed

	static int days, Rate;// (UC1 to UC3)
	static String name;// (UC1 to UC3)

	/*
	 * UC1 EMPLOYEE WAGE
	 */
	public static void EmplywagePA() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee name :");
		name = sc.next();
		System.out.print("Enter the days :");
		days = sc.nextInt();

		System.out.println("Entre the employee name : " + name);

		// Iterating given number of days
		for (int i = 1; i <= days; i++) {
			// creating random number
			double emp = Math.floor(Math.random() * 10 % 2);
			// checking if employee is present or absent using if statement
			if (emp == 0)
				absent++;
			else if (emp == 1)
				present++;
			else
				break;
		} // End For loop
		/*
		 * Displaying the Total days
		 */
		System.out.println("\nEmployee is present for " + present);
		System.out.println("Employee is abscent for " + absent);
	}

	/*
	 * UC2 EMPLOYEE WAGE
	 */
	public static void Emplycalwage() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee Rate :");
		Rate = sc.nextInt();

		// calling EmplywagePA function
		EmplywagePA();
		/*
		 * calculating the Wages for:- [equation=(rate*Hours*days)] Present days Absent
		 * days
		 */
		int Present_wage = Rate * Fixed_hrs * present;// Present days
		int Absent_wage = Rate * Fixed_hrs * absent; // Absent days
		/*
		 * Displaying the Total amount
		 */
		System.out.println("\nThe present wage amount is : ₹ " + Present_wage);
		System.out.println("The absent wage amount is : ₹ " + Absent_wage);
	}

	/*
	 * UC3 EMPLOYEE WAGE
	 */
	public static void EmplyPartTimeWage() {
		// calling EmplywagePA function
		Emplycalwage();
		// Iterating given number of days
		for (int i = 1; i <= days; i++) {
			// creating random number
			double emp = Math.floor(Math.random() * 10 % 3);
			// checking if employee is present or absent using if statement
			if (emp == 0)
				continue;
			else if (emp == 1)
				continue;
			else if (emp == 2)
				Part_Time_days1++;
			else
				break;
		}
		/*
		 * calculating the Wages for:- [equation=(rate*Hours*days)] Part_Time
		 */
		int Part_Time_wage = Rate * Part_Time_Fixed_hrs * Part_Time_days1; // Part_Time days
		/*
		 * Displaying the Total amount
		 */
		System.out.println("The part time dasy is " + Part_Time_days1 + "wage wage amount is : ₹ " + Part_Time_wage);
	}

	/*
	 * UC4 EMPLOYEE WAGE
	 */
	public static void EmplyWageSwitchCase() {
		String name1;
		int rate1, days;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the employee name :");
		name1 = sc.next();
		System.out.print("Enter the days :");
		days = sc.nextInt();
		System.out.print("Enter the rate :");
		rate1 = sc.nextInt();
		System.out.println("Entre the employee name : " + name1);
		int total_Working_Hrs = 0;
		for (int i = 1; i <= days; i++) {

			if (total_Working_Hrs <= 100 && i <= 20) {

				total_Working_Hrs = (Fixed_hrs * Prasent1) + (Part_Time_Fixed_hrs * Partime1);
				total_Working_Hrs += total_Working_Hrs;

				int emp = (int) Math.floor(Math.random() * 10 % 3);
				switch (emp) {
				case 0:
					absent1++;
					break;
				case 1:
					Prasent1++;
					break;
				case 2:
					Partime1++;
					break;
				}
			} // end of while

		} // end of for loop

		/*
		 * calculating the Wages for:- [equation=(rate*Hours*days)] Present days Absent
		 * days
		 */
		int Present_wage1 = rate1 * Fixed_hrs * Prasent1;// Present days
		int Part_Time_wage1 = rate1 * Part_Time_Fixed_hrs * Partime1; // Part_Time days
		int Absent_wage1 = rate1 * Fixed_hrs * absent1; // Absent days
		/*
		 * Displaying the Total days
		 */
		System.out.println("\nStopping the program at 100hrs : " + total_Working_Hrs);
		System.out.println("\nThe present days is " + Prasent1 + " and wage amount is : ₹ " + Present_wage1);
		System.out.println("The absent days is " + absent1 + "  wage amount is : ₹ " + Absent_wage1);
		System.out.println("The part time days is " + Partime1 + " wage wage amount is : ₹ " + Part_Time_wage1);
	}

	/*
	 * UC5 EMPLOYEE WAGE
	 * 
	 * Giving input as 20 Days
	 */
	public static void EmplyWage20Days() {
		EmplyWageSwitchCase();
	}

	/*
	 * UC6 EMPLOYEE WAGE
	 * 
	 * Condition are 100 hours and 20 Days
	 */
	public static void EmplyWage100HrsAnd20Days() {

		EmplyWage20Days();
//		int total_Working_Days=(Fixed_hrs*Prasent1)+(Part_Time_Fixed_hrs*Partime1);
//		System.out.println(total_Working_Days);
	}

	/*
	 * Main Function
	 */
	public static void main(String[] args) {
		/*
		 * UC7 EMPLOYEE WAGE 
		 * Write a Class Method to Compute Employee Wage -
		 * Use Class Method and Class
		 */
		EmplyWage e = new EmplyWage();
//		e.EmplywagePA(); 			 // UC1
//		e.Emplycalwage(); // UC2
//		e.EmplyPartTimeWage(); // UC3
//		e.EmplyWageSwitchCase();	 // UC4
//		e.EmplyWage20Days(); 		 // UC5
//		e.EmplyWage100HrsAnd20Days();// UC6

	}
}
