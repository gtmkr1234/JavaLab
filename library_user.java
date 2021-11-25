import java.util.Scanner;
public interface LibraryUser {
    public void registerAccount();
    public void requestBook();
}
abstract class KidUser implements LibraryUser{
    Scanner inp = new Scanner(System.in);
    KidUser(){
        System.out.println("Enter your age");
        age = inp.nextInt();
        System.out.println("Enter the booktype");
        inp.nextLine();
        bookType = inp.nextLine();
    }
    int age;
    String bookType;
    public void registerAccount(){
        if (age<12){
            System.out.println("You have Successfully registered under a kid account");
        }
        else{
            System.out.println("Sorry, age must be less than 12 to to register as a kid ");
        }
    }
    public void requestBook(){
        if (bookType.equals("Kids") && age<12){
            System.out.println("Book issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
abstract class AdultUser implements LibraryUser{
    Scanner inp = new Scanner(System.in);
    int age;
    String bookType;
    AdultUser(){
        System.out.println("Enter your age");
        age = inp.nextInt();
        System.out.println("Enter the booktype");
        inp.nextLine();
        bookType = inp.nextLine();

    }
    public void registerAccount(){
        if (age>12){
            System.out.println("You have Successfully registered under a Adult account");
        }
        else{
            System.out.println("Sorry, age must be greater than 12 to to register as a kid ");
        }
    }
    public void requestBook(){
        if (bookType.equals("Fiction") && age>12){
            System.out.println("Book issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult fiction books");
        }
    }
}
class LibraryInterfaceDemo{
    public static void main(String[] args) {
       // Scanner inp  = new Scanner(System.in);
        AdultUser obj1 = new AdultUser() {};
        obj1.registerAccount();
        obj1.requestBook();

    }
}
