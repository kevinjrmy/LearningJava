import java.util.Scanner;

public class MazeGame {

			
public static void main(String[] args) {
		System.out.println("Find The Hidden Treasure!");
		System.out.println("| . | . | . | $ |\n" +
						   "| . | . | . | . |\n" +
						   "| . | . | . | . |\n" +
						   "| @ | . | . | . |");
		System.out.println("Type + Press Enter\na: Move Left\nd: Move Right\nw: Move Up\ns: Move Down");
		
		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();
		
		//first move
		if (answer.equals("d")){
			System.out.println("Next move");
			System.out.println("| . | . | . | $ |\n" +
			   		   		   "| . | . | . | . |\n" +
			   		   		   "| . | . | . | . |\n" +
			   		   		   "| . | @ | . | . |");
		}
		else{
			while(!answer.equals("d")){
				System.out.println("No path! Try again");
				answer = input.nextLine();}
				
				if (answer.equals("d")){
					System.out.println("Next move");
					System.out.println("| . | . | . | $ |\n" +
							   		   "| . | . | . | . |\n" +
							   		   "| . | . | . | . |\n" +
							   		   "| . | @ | . | . |");}	
		}
		
		//second move
		answer = input.nextLine();
		if (answer.equals("w")){
			System.out.println("Next move");
			System.out.println("| . | . | . | $ |\n" +
						   	   "| . | . | . | . |\n" +
						   	   "| . | @ | . | . |\n" +
			   		   		   "| . | . | . | . |");
		}
		else{
			while(answer.equals("a")){
				System.out.println("You can't go back!");
				answer = input.nextLine();
				if (answer.equals("w")){
					System.out.println("Next move");
					System.out.println("| . | . | . | $ |\n" +
							   		   "| . | . | . | . |\n" +
							   		   "| . | @ | . | . |\n" +
							   		   "| . | . | . | . |");}
			while(!answer.equals("w")){
				System.out.println("No path! Try again");
				answer = input.nextLine();
				while(answer.equals("a")){
					System.out.println("You can't go back!");
					answer = input.nextLine();}
				if (answer.equals("w")){
					System.out.println("Next move");
					System.out.println("| . | . | . | $ |\n" +
							   		   "| . | . | . | . |\n" +
							   		   "| . | @ | . | . |\n" +
							   		   "| . | . | . | . |");}
				}
			}
		}
		
		//third move
		answer = input.nextLine();
		if(answer.equals("d")){
			System.out.println("Next move");
			System.out.println("| . | . | . | $ |\n" +
						   	   "| . | . | . | . |\n" +
						   	   "| . | . | @ | . |\n" +
			   		   		   "| . | . | . | . |");
		}
		else{
			while(answer.equals("s")){
				System.out.println("You can't go back!");
				answer = input.nextLine();
				if (answer.equals("d")){
					System.out.println("Next move");
					System.out.println("| . | . | . | $ |\n" +
							   		   "| . | . | . | . |\n" +
							   		   "| . | . | @ | . |\n" +
							   		   "| . | . | . | . |");}
			}
			while(!answer.equals("d")){
				System.out.println("No path! Try again");
				answer = input.nextLine();
				while(answer.equals("s")){
					System.out.println("You can't go back!");
					answer = input.nextLine();}
				if(answer.equals("d")){
					System.out.println("Next move");
					System.out.println("| . | . | . | $ |\n" +
								   	   "| . | . | . | . |\n" +
								   	   "| . | . | @ | . |\n" +
					   		   		   "| . | . | . | . |");
				}	
			}
		}
		
		//fourth move
		answer = input.nextLine();
		if(answer.equals("d")){
			System.out.println("Next move");
			System.out.println("| . | . | . | $ |\n" +
						   	   "| . | . | . | . |\n" +
						   	   "| . | . | . | @ |\n" +
			   		   		   "| . | . | . | . |");
		}
		else{
			while(answer.equals("a")){
				System.out.println("You can't go back!");
				answer = input.nextLine();
				if (answer.equals("d")){
					System.out.println("Next move");
					System.out.println("| . | . | . | $ |\n" +
							   		   "| . | . | . | . |\n" +
							   		   "| . | . | . | @ |\n" +
							   		   "| . | . | . | . |");}
			}
			while(!answer.equals("d")){
				System.out.println("No path! Try again");
				answer = input.nextLine();
				while(answer.equals("a")){
					System.out.println("You can't go back!");
					answer = input.nextLine();}
				if(answer.equals("d")){
					System.out.println("Next move");
					System.out.println("| . | . | . | $ |\n" +
								   	   "| . | . | . | . |\n" +
								   	   "| . | . | . | @ |\n" +
					   		   		   "| . | . | . | . |");
				}
			}
		}
		
		//fifth move
		answer = input.nextLine();
		if(answer.equals("w")){
			System.out.println("Next move");
			System.out.println("| . | . | . | $ |\n" +
						   	   "| . | . | . | @ |\n" +
						   	   "| . | . | . | . |\n" +
			   		   		   "| . | . | . | . |");
		}
		else{
			while(answer.equals("a")){
				System.out.println("You can't go back!");
				answer = input.nextLine();
				if (answer.equals("w")){
					System.out.println("Next move");
					System.out.println("| . | . | . | $ |\n" +
							   		   "| . | . | . | @ |\n" +
							   		   "| . | . | . | . |\n" +
							   		   "| . | . | . | . |");}
			}
			while(!answer.equals("w")){
				System.out.println("No path! Try again");
				answer = input.nextLine();
				while(answer.equals("a")){
					System.out.println("You can't go back!");
					answer = input.nextLine();}
				if(answer.equals("w")){
					System.out.println("Next move");
					System.out.println("| . | . | . | $ |\n" +
								   	   "| . | . | . | @ |\n" +
								   	   "| . | . | . | . |\n" +
					   		   		   "| . | . | . | . |");
				}
			}
		}
		
		//sixth move
		answer = input.nextLine();
		
		if(answer.equals("w")){
			System.out.println("Password:(Kevin's number)");
			answer = input.nextLine();
		}
		else{
			while(answer.equals("s")){
				System.out.println("You can't go back!");
				answer = input.nextLine();
				if (answer.equals("w")){
					System.out.println("Password:(Kevin's number)");}
			}
			while(!answer.equals("w")){
				System.out.println("No path! Try again");
				answer = input.nextLine();
				while(answer.equals("s")){
					System.out.println("You can't go back!");
					answer = input.nextLine();}
				if(answer.equals("w")){
					System.out.println("Password:(Kevin's number)");
				}
			}
		}
		
		String number = "09172437333";
		
		if(answer.equals(number)){
			System.out.println("$$ The treasure is yours! $$\nCONGRATULATIONS");
		}
		else
			while(!answer.equals(number)){
				System.out.println("Try again");
				answer = input.nextLine();
			if (answer.equals(number)){
				System.out.println("$$ The treasure is yours! $$");
				System.out.println("CONGRATULATIONS");
				}
			}
		input.close();
	}
}
