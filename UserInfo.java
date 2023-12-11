import java.util.Scanner;

public class UserInfo {
    private int id;
    private long ccNumber;
    private int numsBehind;
    private String name;
    private String surname;
    private String email;
    private String address;

    public int getId() {
        return this.id;
    }

    public long getCcNumber() {
        return this.ccNumber;
    }

    public int getNumsBehind() {
        return this.numsBehind;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress() {
        return this.address;
    }

    public UserInfo() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your ID: ");
        this.id = s.nextInt();

        System.out.print("Enter Credit Card Number: ");
        this.ccNumber = s.nextLong();

        System.out.print("Enter 3 numbers of the CC: ");
        this.numsBehind = s.nextInt();

        s.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        this.name = s.nextLine();

        System.out.print("Enter Surname: ");
        this.surname = s.nextLine();

        System.out.print("Enter Email: ");
        this.email = s.nextLine();

        System.out.print("Enter Address: ");
        this.address = s.nextLine();

        s.close();
    }
}
