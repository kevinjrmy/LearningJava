import java.util.Scanner;


public class SimpleCashier {

	public static void main(String[] args) {
		 
		System.out.println("1. Hamburger : 150");
		System.out.println("2. Nuggets : 100");
	    System.out.println("3. Pizza : 290");
	    System.out.println("Pick your meal: ");
	    
	    Scanner scanner = new Scanner(System.in);	
	    String order = scanner.next();
	    
	    if(order.equals("1")){
	    	System.out.println("Your Order: Hamburger");
	    }
	    else if(order.equals("2")){
	    	System.out.println("Your order: Nuggets");
	    }
	    else if(order.equals("3")){
	    	System.out.println("Your order: Pizza");
	    }
	    else{
	    	System.out.println("Please choose 1, 2, or 3");
	    }
	    
		System.out.println("How many?");
		int quantity = scanner.nextInt();
		
		System.out.println("Quantity: " + quantity);
		
		if(order.equals("1")){
	    	System.out.println("Total: " + (quantity * 150));
	    }
	    else if(order.equals("2")){
	    	System.out.println("Total: " + (quantity * 100));
	    }
	    else if(order.equals("3")){
	    	System.out.println("Total: " + (quantity * 290));
	    }
	    else{
	    	System.out.println("Sorry your order cannot be processed");
	    }
		
		System.out.println("Your payment: ");
		int money = scanner.nextInt();
		
		if(order.equals("1")){
			System.out.println("Your change: " + (money - (quantity * 150)));
	    }
	    else if(order.equals("2")){
	    	System.out.println("Your change: " + (money - (quantity * 100)));
	    }
	    else if(order.equals("3")){
	    	System.out.println("Your change: " + (money - (quantity * 290)));
	    }
	    else{
	    	System.out.println("Sorry your order cannot be processed");
	    }
		
		scanner.close();
		
		System.out.println("Thank you!");  
	}
}
