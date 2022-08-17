//..........................Guesser Game..................................

import java.util.Scanner;

class Guesser
{
	int guessNum;
	public int guessNumber()
	{
		Scanner scan= new Scanner(System.in);
		
		do 
		{
		System.out.println("Guesser...Kindly guess the number below 10");
		guessNum= scan.nextInt();
		if(guessNum>10)
		{
			System.out.println("Invalid guess");
		}
		}while(guessNum>11);
		
		return guessNum;
	}
}

class Player{
	int pGuessNum;
	
	public int guessNumber()
	{
		Scanner scan= new Scanner(System.in);

		System.out.println("Player...Kindly find the number guessesed by Guesser..Hint: Number is below 10");
		pGuessNum= scan.nextInt();
		
		if(pGuessNum>10)
		{
			System.out.println("Sorry..Guessed number is more than 10...Missed your chance");
		}
	
		return pGuessNum;
	}
	}
	
class Umpire
	{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;

	
	public void collectNumFromGuesser()
	{
		Guesser g= new Guesser();
		numFromGuesser=	g.guessNumber();
	}
	
	public void collectNumFromPlayer()
	{
	 Player p1= new Player();
	 Player p2= new Player();
	 Player p3= new Player();
	 Player p4= new Player();

	 numFromPlayer1=p1.guessNumber();
	 numFromPlayer2=p2.guessNumber();
	 numFromPlayer3=p3.guessNumber();
	 numFromPlayer4=p4.guessNumber();
	
	 
	}
	public void compare()
	{
	
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3 &&numFromGuesser==numFromPlayer4)
				System.out.println("Game tied..All 4 players Guessed Correctly");
			else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
				System.out.println("Player 1, Player 2 and Player 3 won the game");
			else if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4)
				System.out.println("Player 1, Player 3 and Player 4 won the game");
			else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer4)
				System.out.println("Player 1, Player 2 and Player 4 won the game");
			else if(numFromGuesser==numFromPlayer2)
				System.out.println("Player 1 and Player 2 won the game");
			else if(numFromGuesser==numFromPlayer3)
				System.out.println("Player 1 and Player 3 won the game");
			else if(numFromGuesser==numFromPlayer4)
				System.out.println("Player 1 and Player 4 won the game");
			else
			    System.out.println("Player 1 won the game");
		}
		else if (numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4)
				System.out.println("Player 2, Player 3 and Player 4 won the game");
			else if(numFromGuesser==numFromPlayer3)
				System.out.println("Player 2 and Player 3 won the game");
			else if(numFromGuesser==numFromPlayer4)
				System.out.println("Player 2 and Player 4 won the game");
			else
			    System.out.println("Player2 won the game");
		}	
		else if (numFromGuesser==numFromPlayer3)
		{
			if( numFromGuesser==numFromPlayer4)
				System.out.println("Player 3 and Player 4 won the game");
			else
			    System.out.println("Player 3 won the game");	
		}
		else if (numFromGuesser==numFromPlayer4)
		{
			System.out.println("Player 4 won the game");		
		}
		
		else 
		{
			System.out.println("Game lost!!! Try again....");	
		}
	}
	
	}



public class LaunchGame {

	public static void main(String[] args) {
		Umpire u= new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}

}
