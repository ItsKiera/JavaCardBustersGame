/* Author: Ciara Morrissey
 * Program Purpose: Two players are given seven cards each. There are seven rounds in the game.
 * For each round, both of the players cards are compared to see who has the highest valued card, the
 * player with the highest value wins the round, and the following statements are printed, depending on 
 * the value of both of the players cards. Whichever player has the most cards, with the highest values, wins the 
 * game.
 */
public class ExerciseOne{
    public static void main(String args[]){
        int[] playerOne = {10, 6, 8, 9, 7, 12, 7};
        int[] playerTwo = {7, 6, 9, 5, 2, 8, 11};

        String winner;
        int playerOneCount = 0;
        int playerTwoCount = 0;
        System.out.println("**************************Play Card Busters!!**************************");
        System.out.println(" ");
        for(int i = 0; i < 7; i++){
            if(playerOne[i] > playerTwo[i]){
                winner = "Player 1";
                ++playerOneCount;
                System.out.println("Round No: " + (i + 1) + "- " + winner + " wins the round: " + playerOne[i] + " beats " + playerTwo[i]);
                System.out.println(" ");
            }else if(playerOne[i] == playerTwo[i]){
                System.out.println("Round No: " + (i + 1) + "- " + "Tie! " + playerOne[i] + " ties with " + playerTwo[i]);
                System.out.println(" ");
            }else{
                winner = "Player 2";
                ++playerTwoCount;
                System.out.println("Round No: " + (i + 1) + "- " + winner + " wins the round: " + playerTwo[i] + " beats " + playerOne[i]);
                System.out.println(" ");
            }
        }
        if(playerOneCount > playerTwoCount){
            System.out.println("Player One wins!! He won " + playerOneCount + " rounds beating Player Two who won " + playerTwoCount + " rounds.");
            System.out.println(" ");
        }else{
            System.out.println("Player Two wins!! He won " + playerTwoCount + " rounds beating Player One who won " + playerOneCount + " rounds.");
            System.out.println(" ");
        }
        System.out.println("Goodbye!");
    }
}