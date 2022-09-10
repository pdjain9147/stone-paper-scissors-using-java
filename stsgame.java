import java.util.Scanner;
import java.util.Random;

public class stsgame {
    public static void main(String[] args) {

//        apponent's move

        System.out.println("STONE    = 1     PAPER    = 2     SCISSORS = 3");
        {
            Random rn = new Random();
            int apponentsinput = rn.nextInt(1, 4);

//        users move
            Scanner sc = new Scanner(System.in);
            System.out.print("ITS YOUR TURN    :");
            int userinput = sc.nextInt();

            if (userinput > 0 && userinput <4)
            {
                System.out.println("APPONENTS TURN   :" + apponentsinput);
                if (userinput == apponentsinput)
                {
                    System.out.println("ITS A DRAW.");
                }
                // user winns
                else if (userinput == 1 && apponentsinput == 3 || userinput == 2 && apponentsinput == 1 || userinput == 3 && apponentsinput == 2)
                {
                    System.out.println("YOU WIN.");
                }
                // apponent wins
                else
                {
                    System.out.println("APPONENT WINS.");
                }
            }
            // invalid number entered.
            else
            {
                System.out.println("ENTER THE VALID KEY.");
            }
        }
    }
}


