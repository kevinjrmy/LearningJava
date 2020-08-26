import java.util.Scanner;


public class Hangman {

	public static void main(String[] args) {
		System.out.println("GUESS WHO I AM!");
		System.out.println(" I am an animal.");
		System.out.println(" I am a good swimmer.");
		System.out.println(" I consist of 5 different letters.");
		System.out.println("           _ _ _ _ _");
		System.out.println();
		System.out.println(" Type 1 letter at a time.");
		System.out.println("       GOOD LUCK!");
		
		
		Scanner scanner = new Scanner(System.in);
		
		String answer = scanner.nextLine();
		String answer2 = "answer2";
		String answer3 = "answer3";
		String answer4 = "answer4";
		String answer5 = "answer5";
		
		
		String w = "w";
		String h = "h";
		String a = "a";
		String l = "l";
		String e = "e";
		
		if(answer.equals(w)){
			System.out.println("You got the first letter! W _ _ _ _");
			System.out.println("Next Letter!");
		}
		else if(answer.equals(h)){
			System.out.println("You got the second letter! _ H _ _ _");
			System.out.println("Next Letter!");
		}
		else if(answer.equals(a)){
			System.out.println("You got the third letter! _ _ A _ _");
			System.out.println("Next Letter!");
		}
		else if(answer.equals(l)){
			System.out.println("You got the fourth letter! _ _ _ L _");
			System.out.println("Next Letter!");
		}
		else if(answer.equals(e)){
			System.out.println("You got the last letter! _ _ _ _ E");
			System.out.println("Next Letter!");
		}
		else{
			while(!answer.equals(w) || !answer.equals(h) || !answer.equals(a) || 
					!answer.equals(l) || !answer.equals(e)){
			    System.out.println("Try again!");
			    answer = scanner.nextLine();
			    
			    if(answer.equals(w)){
					System.out.println("You got the first letter! W _ _ _ _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer.equals(h)){
					System.out.println("You got the second letter! _ H _ _ _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer.equals(a)){
					System.out.println("You got the third letter! _ _ A _ _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer.equals(l)){
					System.out.println("You got the fourth letter! _ _ _ L _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer.equals(e)){
					System.out.println("You got the last letter! _ _ _ _ E");
					System.out.println("Next Letter!");
					break;
			    }
			}
		}
		answer2 = scanner.nextLine();
		
		while(answer2.equals(answer)){
			System.out.println("No repeated letter DUH. Try again!");
			answer2 = scanner.nextLine();}
		
		if(answer2.equals(w)){
			System.out.println("You got the first letter! W _ _ _ _");
			System.out.println("Next Letter!");
		}
		else if(answer2.equals(h)){
			System.out.println("You got the second letter! _ H _ _ _");
			System.out.println("Next Letter!");
		}
		else if(answer2.equals(a)){
			System.out.println("You got the third letter! _ _ A _ _");
			System.out.println("Next Letter!");
		}
		else if(answer2.equals(l)){
			System.out.println("You got the fourth letter! _ _ _ L _");
			System.out.println("Next Letter!");
		}
		else if(answer2.equals(e)){
			System.out.println("You got the last letter! _ _ _ _ E");
			System.out.println("Next Letter!");
		}
		else{
			while(!answer2.equals(w) || !answer2.equals(h) || !answer2.equals(a) || 
					!answer2.equals(l) || !answer2.equals(e)){
			    System.out.println("Try again!");
			    answer2 = scanner.nextLine();
			    
			    if(answer2.equals(w)){
					System.out.println("You got the second letter! W _ _ _ _");
					System.out.println("Next Letter!");
					break;
				}
			    else if(answer2.equals(h)){
					System.out.println("You got the second letter! _ H _ _ _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer2.equals(a)){
					System.out.println("You got the third letter! _ _ A _ _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer2.equals(l)){
					System.out.println("You got the fourth letter! _ _ _ L _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer2.equals(e)){
					System.out.println("You got the last letter! _ _ _ _ E");
					System.out.println("Next Letter!");
					break;
			    }
			}
		}
		answer3 = scanner.nextLine();
		
		while(answer3.equals(answer) || answer3.equals(answer2)){
			System.out.println("No repeated letter DUH. Try again!");
			answer3 = scanner.nextLine();}
		
		if(answer3.equals(w)){
			System.out.println("You got the first letter! W _ _ _ _");
			System.out.println("Next Letter!");
		}
		else if(answer3.equals(h)){
			System.out.println("You got the second letter! _ H _ _ _");
			System.out.println("Next Letter!");
		}
		else if(answer3.equals(a)){
			System.out.println("You got the third letter! _ _ A _ _");
			System.out.println("Next Letter!");
		}
		else if(answer3.equals(l)){
			System.out.println("You got the fourth letter! _ _ _ L _");
			System.out.println("Next Letter!");
		}
		else if(answer3.equals(e)){
			System.out.println("You got the last letter! _ _ _ _ E");
			System.out.println("Next Letter!");
		}
		else{
			while(!answer3.equals(w) || !answer3.equals(h) || !answer3.equals(a) || 
					!answer3.equals(l) || !answer3.equals(e)){
			    System.out.println("Try again!");
			    answer3 = scanner.nextLine();
			    
			    if(answer3.equals(w)){
					System.out.println("You got the second letter! W _ _ _ _");
					System.out.println("Next Letter!");
					break;
				}
			    else if(answer3.equals(h)){
					System.out.println("You got the second letter! _ H _ _ _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer3.equals(a)){
					System.out.println("You got the third letter! _ _ A _ _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer3.equals(l)){
					System.out.println("You got the fourth letter! _ _ _ L _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer3.equals(e)){
					System.out.println("You got the last letter! _ _ _ _ E");
					System.out.println("Next Letter!");
					break;
			    }
			}
		}
		
		answer4 = scanner.nextLine();
		
		while(answer4.equals(answer) || answer4.equals(answer2) || answer4.equals(answer3)){
			System.out.println("No repeated letter DUH. Try again!");
			answer4 = scanner.nextLine();}
		
		if(answer4.equals(w)){
			System.out.println("You got the first letter! W _ _ _ _");
			System.out.println("Next Letter!");
		}
		else if(answer4.equals(h)){
			System.out.println("You got the second letter! _ H _ _ _");
			System.out.println("Next Letter!");
		}
		else if(answer4.equals(a)){
			System.out.println("You got the third letter! _ _ A _ _");
			System.out.println("Next Letter!");
		}
		else if(answer4.equals(l)){
			System.out.println("You got the fourth letter! _ _ _ L _");
			System.out.println("Next Letter!");
		}
		else if(answer4.equals(e)){
			System.out.println("You got the last letter! _ _ _ _ E");
			System.out.println("Next Letter!");
		}
		else{
			while(!answer4.equals(w) || !answer4.equals(h) || !answer4.equals(a) || 
					!answer4.equals(l) || !answer4.equals(e)){
			    System.out.println("Try again!");
			    answer4 = scanner.nextLine();
			    
			    if(answer4.equals(w)){
					System.out.println("You got the second letter! W _ _ _ _");
					System.out.println("Next Letter!");
					break;
				}
			    else if(answer4.equals(h)){
					System.out.println("You got the second letter! _ H _ _ _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer4.equals(a)){
					System.out.println("You got the third letter! _ _ A _ _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer4.equals(l)){
					System.out.println("You got the fourth letter! _ _ _ L _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer4.equals(e)){
					System.out.println("You got the last letter! _ _ _ _ E");
					System.out.println("Next Letter!");
					break;
				}
			}
		}
		answer5 = scanner.nextLine();
		
		while(answer5.equals(answer) || answer5.equals(answer2) || answer5.equals(answer3) || answer5.equals(answer4)){
			System.out.println("No repeated letter DUH. Try again!");
			answer5 = scanner.nextLine();}
		
		if(answer5.equals(w)){
			System.out.println("You got the first letter! W _ _ _ _");
			System.out.println("Next Letter!");
		}
		else if(answer5.equals(h)){
			System.out.println("You got the second letter! _ H _ _ _");
			System.out.println("Next Letter!");
		}
		else if(answer5.equals(a)){
			System.out.println("You got the third letter! _ _ A _ _");
			System.out.println("Next Letter!");
		}
		else if(answer5.equals(l)){
			System.out.println("You got the fourth letter! _ _ _ L _");
			System.out.println("Next Letter!");
		}
		else if(answer5.equals(e)){
			System.out.println("You got the last letter! _ _ _ _ E");
			System.out.println("Next Letter!");
		}
		else{
			while(!answer5.equals(w) || !answer5.equals(h) || !answer5.equals(a) || 
					!answer5.equals(l) || !answer5.equals(e)){
			    System.out.println("Try again!");
			    answer5 = scanner.nextLine();
			    
			    if(answer5.equals(w)){
					System.out.println("You got the second letter! W _ _ _ _");
					System.out.println("Next Letter!");
					break;
				}
			    else if(answer5.equals(h)){
					System.out.println("You got the second letter! _ H _ _ _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer5.equals(a)){
					System.out.println("You got the third letter! _ _ A _ _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer5.equals(l)){
					System.out.println("You got the fourth letter! _ _ _ L _");
					System.out.println("Next Letter!");
					break;
				}
				else if(answer5.equals(e)){
					System.out.println("You got the last letter! _ _ _ _ E");
					System.out.println("Next Letter!");
					break;
				}
			}
		}
		
		System.out.println("So, what is it?");
		String answer6 = scanner.nextLine();
			
		System.out.println(answer2);
		
		if(answer6.equals("whale") || answer6.equals("Whale") || answer6.equals(("WHALE"))){
			System.out.println("You got it! CONGRATULATIONS!");
		}
		else
			while(!answer6.equals("whale") || !answer6.equals("Whale") || !answer6.equals("WHALE")){
				System.out.println("Oops! Typo. Try Again!");
				answer6 = scanner.nextLine();
				if(answer6.equals("whale") || answer6.equals("Whale") || answer6.equals(("WHALE"))){
					System.out.println("You got it! CONGRATULATIONS!"); break;}
			}
	}
}

