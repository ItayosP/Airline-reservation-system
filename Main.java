import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Hello welcome to Itayos's Airlines");
        System.out.println("About Us (1) | Order a ticket (2)");

        int aboutUsOrOrder = s.nextInt();

        s.nextLine();

        if (aboutUsOrOrder == 1) {
            System.out.println("You can find info here: https://somelink.com");
        } else if (aboutUsOrOrder == 2) {
            System.out.println("We start right away");

            System.out.println("How many tickets do you need?");
            String ticketsNum = s.nextLine();

            int ticketsNumInt = Integer.parseInt(ticketsNum);

            UserInfo info = new UserInfo();

            System.out.println("Hello "+info.getName()+" "+info.getSurname());

            System.out.println("Where do you want to fly?");

            String[] countries = {"France", "Mexico", "Spain", "Turkiy", "Italy", "United States", "Greece", "Austria", "Germany", "United Arab Emirates"};

            for (int i=0; i<countries.length; i++) {
                System.out.println("[" + (i + 1) + "] -> " + countries[i]);
            }

            int country = s.nextInt();

            while (country<=0 || country>=countries.length) {
                System.out.println("Enter valid country number.");
                country = s.nextInt()-1;
            }

            System.out.println("You chose " + countries[country] + ", Flight takes off at: " +  + r.nextInt(1, 31) + "/" + r.nextInt(1, 12));



            System.out.println("Choose seat: ");
            System.out.println("[1] -> Economy [0$]\n [2] -> Premium Economy[50$]\n [3] -> Business class[100$]\n [4] -> First class[200$]");

            int seat = s.nextInt();

            int price = r.nextInt(150, 300);

            if (seat == 1) {
                System.out.println("Price is: "+(price * ticketsNumInt)+"$");
            }

            else if (seat == 2) {
                System.out.println("Price is: "+((price+50)*ticketsNumInt)+"$");
            }

            else if (seat == 3) {
                System.out.println("Price is: "+((price+100)*ticketsNumInt)+"$");
            }

            else if (seat == 4) {
                System.out.println("Price is: "+((price+200)*ticketsNumInt)+"$");
            } else {
                System.out.println("Invalid choice.. Return");
            }



        } else {
            System.out.println("You can't do that. Returning...");
        }

        s.close();
    }
}
