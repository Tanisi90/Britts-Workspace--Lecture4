import java.util.Scanner;

/*
		 * == : are the values equal 
		 * > : greater than a value (meaning higher than a value)
		 * < : less than a value (lower than a value)
		 * >=: greater than or equal to a value (value is included)
		 * <=: less than or equal to a value (value is included)
		 */

         /*
		 * || or
		 * T  T = T
		 * T  F = T
		 * F  T = T
		 * F  F = F
		 * 
		 * && and
		 * T  T = T
		 * T  F = F
		 * F  T = F
		 * F  F = F
		 */
	// if- else blocks yes, no questions 
	//conditions always evaluation to true or false
	/* 
	if(condition){
		//if my condition is true do this block of code.
	}else{
		//if condition is false do this. 
	}
	*/

	/* if(condition){
		//if this condition is true do this
	} else if (condition){
		//if this condition proves true do this one
	} else{
		//none of the above were true so run else block. 
	}
	*/

	/* switch statement is generally used for menus of some sort. 
	 * switch(expression){
	 * case 1:
	 * //some code
	 * break;
	 * case 2:
	 * //some code
	 * break;
	 * default:
	 * //some code
	 * break;
	 * }
	 */

	 public class CoffeeShop{
		static Scanner sc = new Scanner(System.in);
		//instance scoped variable

		String coffee;
		double americanoPrice = 3.99;
		double lattePrice = 4.99;
		double payment;
		//I am trying to make a small coffee shop. 
		//Input from user - Scanner
		//price for my coffees - variables
		//a way process payments - method
		//a way for the user to order - switch
			public static void main(String[] args){

				// String name = "Brittany";
				// String name2 = "Brittany";

				// String name3 = new String("Brittany");
				// name = "Adam";
				// System.out.println(name.toLowerCase());
				// System.out.println(name);
				// String name4 = name.toLowerCase();
				// System.out.println(name4);

				// System.out.println(name == name2);  //false
				// System.out.println(name == name4); //false

				CoffeeShop cs = new CoffeeShop();
				cs.menu();
				sc.close();

			}

		public void menu(){
			System.out.println("Welcome to my coffeeShop!");
			while(true){
			System.out.println("Would you like an Americano or Latte?");
			coffee = sc.nextLine().toLowerCase();
			switch(coffee){
				case "americano":
				System.out.println("Ok I have put in your order for an americano");
				System.out.println("The total of your order is " + americanoPrice);
				payment();
				break;
				case "latte":
				System.out.println("Ok I have put in your order for an latte");
				System.out.println("The total of your order is " + lattePrice);
				payment();
				break;
				default:
				System.out.println("I am sorry I don't have that!");
			}
			System.out.println("Do you want to re-order? Enter Y for yes and N for no");

			if(sc.nextLine().equalsIgnoreCase("Y")){
			 System.out.println("Would you like an Americano or Latte?");
			}else if(sc.nextLine().equalsIgnoreCase("N")){
				break;
			}else{
				System.out.println("I don't under your request?");
			}

		}
		}

		public void payment(){
			System.out.println("Please enter you payment...");
			//local scoped variable payment is only visible in the payment method
			payment = sc.nextDouble();
			//create change
			//get payment per item
			if(coffee.equalsIgnoreCase("americano") && payment >= americanoPrice){
				System.out.println("Here is your Americano");
				if(payment > americanoPrice){
					double change = payment - americanoPrice;
					System.out.println("Here is your change " + change);
				}
			}else if(coffee.equalsIgnoreCase("latte") && payment >= lattePrice){
				System.out.println("Here is your Latte");
				if(payment > lattePrice){
					double change = payment - lattePrice;
					System.out.println("Here is your change " + change);
				}
			}else{
				System.out.println("Sorry you didn't give me enough");
			}

	 }
}