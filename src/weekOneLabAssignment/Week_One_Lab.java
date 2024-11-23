package weekOneLabAssignment;

public class Week_One_Lab {

	public static void main(String[] args) {
		

		// 1. Create a variable to hold the quantity of 
				//		available plane seats left on a flight		

				int seatsLeft = 13;
		
				// 2. Create a variable to hold the cost of groceries at checkout

				double costOfGroceries = 148.97;
				
				// 3. Create a variable to hold a person's middle initial

				char middleInitial = 'C';
			
				// 4. Create a variable to hold true if it's hot outside 
				//		and false if it's cold outside

				boolean hotOutside = true;
				boolean coldOutside = false;
				
				// 5. Create a variable to hold a customer's first name

				String firstName = "Richard";
				
				// 6. Create a variable to hold a street address
				
				String streetAddress = "47 Ronin Ave.";

				// 7. Print all variables to the console
			
				System.out.println(seatsLeft);
				System.out.println(costOfGroceries);
				System.out.println(middleInitial);
				System.out.println(hotOutside);
				System.out.println(coldOutside);
				System.out.println(firstName);
				System.out.println(streetAddress);
				
				// 8. A customer booked 2 plane seats, 
				//		remove 2 seats from the available seats variable
			
				seatsLeft = seatsLeft - 2;
				
				// 9. Impulse candy bar purchase, add 2.15 to the grocery total
				// 		costOfGroceries = costOfGroceries + 2.15;

				costOfGroceries = costOfGroceries + 2.15;
				
				// 10.  The birth certificate was printed incorrectly, 
				//		change the middle initial to something else
				
				middleInitial = 'B';

				// 11.  The season has changed, update the hot outside 
				//			variable to be opposite of what it was

				hotOutside = false;

				// 12.  Create a new variable called full name using the customer's first name, 
				//			the middle initial, and a last name of your choice
			
				String lastName = "Brown";
				String fullName = firstName + " " + middleInitial + ". " + lastName;
				
				// 13.  Print a line to the console that introduces the customer and says they live
				// 			at the address variable

				System.out.println("Customer: " + fullName + ". " + "Current address: " + streetAddress);
				
		
	}

}
