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
	 * Main Function
	 */
	public static void main(String[] args) {
		/*
		 * UC7 EMPLOYEE WAGE write a Class Method to Compute Employee Wage - Use Class
		 * Method and Class
		 */
		EmplyWage e = new EmplyWage();
//		e.EmplywagePA(); 			 // UC1
//		e.Emplycalwage(); // UC2
		e.EmplyPartTimeWage(); // UC3

	}
}
