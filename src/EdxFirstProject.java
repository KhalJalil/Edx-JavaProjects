
import java.util.Scanner;
public class EdxFirstProject {
    public static void main(String[]args)

    {

        intro();
        budget();
        time();
        distance();

    }

    public static void intro(){
        Scanner takein = new Scanner(System.in);
        System.out.println("Welcome to the Holiday planner |");
        System.out.print("Whats your name  ");
        String name = takein.nextLine();

        System.out.print("Hey there "+name+" Where are you travelling to ");
        String location = takein.nextLine();
        System.out.println(location+" ...How nice a retreat ");
        //takein.close();
    }

    public static void budget() {
        Scanner takein = new Scanner(System.in);
        System.out.print("How many days do you plan to be away ");
        int days= takein.nextInt();
        System.out.print("How much money do you plan on spending in dollars ");
        double money= takein.nextDouble();
        System.out.print("Whats the three letter Symbol for your curency ");
        String currency= takein.next();

        System.out.print("How many "+currency+" are in 1 dollar ");
        double forex= takein.nextDouble();

        System.out.println(days+" Days is the same as "+ (days*24)+" hours or "+((days * 24)*60)+" minutes");

        int estimateDollar= (int)(money/days*100);

        System.out.println("If you're spending $"+money+" ,Then per day you could spend"+(estimateDollar/100.0) );
        int estimateLocal = (int)((money*forex/days)*100);

        System.out.println("Your total in "+currency+(" is ")+(money*forex)+(" which per day is ")+(estimateLocal/100.0));

    }

    public static void time() {
        Scanner takein = new Scanner(System.in);
        System.out.print("Whats the time difference between your home and destination  ");
        int timediff= takein.nextInt();

        System.out.println("That means when its midnight at home it will be "+(0.00+timediff)+("AM at your destination and when its noon it'll be ")+((12.00+timediff)%24)+("PM"));

    }

    public static void distance() {
        Scanner takein = new Scanner(System.in);
        System.out.print("Whats the square area of your country in km? ");
        double area= takein.nextDouble();
        int areasq=((int) (area* 0.386102))*100;
        System.out.print("In miles that's  "+(areasq/100)+("miles"));

    }
}
