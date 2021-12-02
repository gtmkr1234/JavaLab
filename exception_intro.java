import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 90;
        try {
            System.out.println(a / 0);
        }
        catch(ArithmeticException obj) {
            System.out.println(obj.toString());
        }
        //We can not use try without catch handler

        System.out.println("End of the program");
    }
}
class Testing{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int inp = sc.nextInt();
        System.out.println(a/b);
        System.out.println(arr[inp]);
    }
}
