import java.util.HashMap;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Games {
//    import java.lang.management.PlatformLoggingMXBean;
//import java.util.Random;
//import java.util.Scanner;
//import java.util.HashMap;

        int playerScore = 0;
        int computerScore = 0;
        String playerFinal = null;
        String playerName = null;

        public void play() {


            HashMap<String, String> moves = new HashMap<String, String>();
            moves.put("r", "rock");
            moves.put("p", "paper");
            moves.put("s", "scissors");

            System.out.println("Let's Play Rock Paper Scissor!");

            //Create a scanner object
            Scanner input = new Scanner(System.in);


            //        Output the prompt
            System.out.println("What is Your Name? ");

            //Wait for the user to input the number
            playerName = input.nextLine();

            //Output the Player Name
            System.out.println("Hello Player " + playerName + " and Player Computer! ");
            System.out.println("Type the correct letter to choose from the following:  \n" +
                    "r : rock \n" +
                    "p : paper \n" +
                    "s : scissors ");

            String playerMove = String.valueOf(input.next().charAt(0));
            System.out.println(playerMove);
            playerFinal = moves.get(playerMove);

            //Computer Move
        }

        public void ComputerMove() {


            String[] moveGenerator = {
                    "rock", "paper", "scissors",
            };

            Random rand = new Random();

            int upperbound = 3;
            int randomMove = rand.nextInt(upperbound);

            String computer = moveGenerator[randomMove];

            System.out.println("Player " + playerName + " chose " + playerFinal + " and Computer chose " + computer);


            if (Objects.equals(playerFinal, "rock") && computer.equals("rock")) {
                System.out.println("That's a tie!");

            }
            else if (Objects.equals(playerFinal, "paper") && computer.equals("paper")) {
                System.out.println("That's a tie!");


            }
            else if (Objects.equals(playerFinal, "scissors") && computer.equals("scissors")) {
                System.out.println("That's a tie!");


            }
            else if (Objects.equals(playerFinal, "paper") && computer.equals("rock")) {
                System.out.println(playerName + " wins!");

                playerScore++;


            }
            else if (Objects.equals(playerFinal, "paper") && computer.equals("scissors")) {
                System.out.println("Computer wins");

                computerScore++;
            }
            else if (Objects.equals(playerFinal, "scissors ") && computer.equals("paper")) {
                System.out.println(playerName + " wins!");
                playerScore++;
            }
            else if (Objects.equals(playerFinal, "rock") && computer.equals("scissors")) {

                System.out.println(playerName + " wins!");
                playerScore++;
            }
            else if (Objects.equals(playerFinal, "rock") && computer.equals("paper")) {

                System.out.println(" Computer wins!");
                computerScore++;
            }
            else if (Objects.equals(playerFinal, "scissors") && computer.equals("rock")) {


                System.out.println("Computer wins!");
                computerScore++;
            }

        }
    }

