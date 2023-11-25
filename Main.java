import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            String more;

            do {

                Games game = new Games();
                game.play();
                game.ComputerMove();

                Scanner input2 = new Scanner(System.in);
                System.out.println("Do you want to play again? (y/n)");
                String answer = input2.nextLine();

                more = String.valueOf(answer.charAt(0));

            } while (more.equals("y"));



        }

    }


