import java.util.*;
import static java.lang.System.out;
//Game about odds and even
public class EdxSecondProject {

    public static void main(String[]args)
    {
        Scanner taker= new Scanner(System.in);
        out.println("Lets's play a game called Odds and Evens");
        out.println("Whats your name Old timer ");

        String name = taker.next();
        out.println(" Why hello there "+name+" Which do you choose (O)dds or (E)vens? ");
        String pick = taker.next();

        if (pick.equals("O")) {
            System.out.println(name+" picked Odds therefore Computer is Evens");
        }
        else if(pick.equals("E")) {
            System.out.println(name+" Picked evens! therefore Computer is Odds ");
        }

        System.out.println("--------------------------------------------------------------");

        System.out.println("How many fingers do you put out?");
        int fingers = taker.nextInt();


        int rand = new Random().nextInt(6);
        System.out.println("Computer has played "+rand+" cyborg fingers");
        System.out.println("--------------------------------------------------------------");
        int sum = fingers + rand;
        System.out.println("Sum of fingers played are: "+fingers+"+"+rand+"="+sum);

        if (sum%2==0 && pick.equals("E")) {
            System.out.println("The sum is Even \n ");

            System.out.println(" The User "+name+" Wins finish him");
        }


        else if (sum%2!=0 && pick.equals("O")) {
            System.out.println("The sum is Odd \n");

            System.out.print(" The User "+name+" Wins finish him \n");

        }
        else
        {
            System.out.print(" Computer Wins... you loser");
        }

        System.out.println("--------------------------------------------------------------");
    }


}

