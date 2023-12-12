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

            System.out.println("\n[1] -> France\n[2] -> Mexico\n[3] -> Spain\n[4] -> Turkiye\n[5] -> Italy\n[6] -> United States\n[7] -> Greece\n[8] -> Austria\n[9] -> Germany\n[10] -> United Arab Emirates");

            String country = s.nextLine();

            switch (country) {
                case "1":
                    System.out.println("You chose France, Flight takes off at: " + r.nextInt(1, 31) + "/" + r.nextInt(1, 12));

                    break;
                case "2":
                    System.out.println("You chose Mexico, Flight takes off at: " + r.nextInt(1, 31) + "/" + r.nextInt(1, 12));

                    break;
                case "3":
                    System.out.println("You chose Spain, Flight takes off at: " + r.nextInt(1, 31) + "/" + r.nextInt(1, 12));

                    break;
                case "4":
                    System.out.println("You chose Turkiye, Flight takes off at: " + r.nextInt(1, 31) + "/" + r.nextInt(1, 12));

                    break;
                case "5":
                    System.out.println("You chose Italy, Flight takes off at: " + r.nextInt(1, 31) + "/" + r.nextInt(1, 12));

                    break;
                case "6":
                    System.out.println("You chose United States, Flight takes off at: " + r.nextInt(1, 31) + "/" + r.nextInt(1, 12));

                    break;
                case "7":
                    System.out.println("You chose Greece, Flight takes off at: " + r.nextInt(1, 31) + "/" + r.nextInt(1, 12));

                    break;
                case "8":
                    System.out.println("You chose Austria, Flight takes off at: " + r.nextInt(1, 31) + "/" + r.nextInt(1, 12));

                    break;
                case "9":
                    System.out.println("You chose Germany, Flight takes off at: " + r.nextInt(1, 31) + "/" + r.nextInt(1, 12));

                    break;
                case "10":
                    System.out.println("You chose United Arab Emirates, Flight takes off at: " + r.nextInt(1, 31) + "/" + r.nextInt(1, 12));

                    break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 10.");
                    break;
            }

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
