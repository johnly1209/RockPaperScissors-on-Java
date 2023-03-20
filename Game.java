package RockPaperScissor;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        //read user's guess
        System.out.print("Please enter rock/paper/scissors: ");
        String userGuest = in.nextLine();

        //generate computer guess
        String[] values = {"rock", "paper", "scissors"};///index: 0,1,2 
        String computerGuess = values [ (int) Math.random()*3 ];

        //decide the winner
        if(userGuest.equals(computerGuess))//draw
        {
            System.out.println("draw!" + "user choice: " + userGuest + ", computer choice: " + computerGuess);

        }
        else if(  // Computer winning combination
        
        (computerGuess.equals("scissors") && userGuest.equals ("paper"))
            ||
            (computerGuess.equals("paper") && userGuest.equals ("rock"))
            ||
            (computerGuess.equals("rock") && userGuest.equals("scissors"))
        ) 
            {
                System.out.println("Computer Won, Better Luck Next Time!! Computer choice: " + computerGuess);
            }
            else{ // Player winning combination
                System.out.println("User won, Wow you're the best!!!! Computer choice: " + computerGuess);
            }

            

        in.close();
    }
    
}
