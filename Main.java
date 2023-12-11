import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Hello welcome to Itayos's Airlines");
        System.out.println("About Us (1) | Order a ticket (2)");

        int aboutUsOrOrder = s.nextInt();

        if (aboutUsOrOrder == 1) {
            System.out.println("You can find info here: https://somelink.com");
        }
        else if (aboutUsOrOrder == 2) {
            System.out.println("We start right away");
            UserInfo info = new UserInfo();

            

        } else {
            System.out.println("You cant do that.. Return");
        }

        s.close();
    }
}