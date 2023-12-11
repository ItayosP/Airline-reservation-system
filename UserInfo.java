import java.util.Scanner;

public class UserInfo {
    private String numsBehind;
    private String id;
    private String ccNumber;
    private String name;
    private String surname;
    private String email;
    private String address;

    public String getCcNumber() {
        return this.ccNumber;
    }

    public String getNumsBehind() {
        return this.numsBehind;
    }

    public String getId() {
        return this.id;
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
        this.id = s.nextLine();

        while (this.id.length() != 8) {
            System.out.print("Enter your ID: ");
            id = s.nextLine();
        }

        System.out.print("Enter Credit Card Number: ");
        this.ccNumber = s.nextLine();

        while (this.ccNumber.length() != 16) {
            System.out.print("Enter Credit Card Number: ");
            this.ccNumber = s.nextLine();
        }

        System.out.print("Enter 3 numbers of the CC: ");
        this.numsBehind = s.nextLine();

        while (this.numsBehind.length() != 3) {
            System.out.print("Enter 3 numbers of the CC: ");
            this.numsBehind = s.nextLine();
        }

        System.out.print("Enter Name: ");
        this.name = s.nextLine();

        System.out.print("Enter Surname: ");
        this.surname = s.nextLine();

        System.out.print("Enter Email: ");
        this.email = s.nextLine();

        while (!this.email.endsWith("@gmail.com")) {
            System.out.print("Enter Email: ");
            this.email = s.nextLine();
        }

        System.out.print("Enter Address: ");
        this.address = s.nextLine();

        s.close();
    }
}
