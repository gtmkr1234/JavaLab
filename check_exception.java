import java.util.InputMismatchException;


class MyException extends RuntimeException
{
    MyException(String exp)
    {
        super(exp);
    }

}

public class CheckException {
    public static void main(String[] args) {

        try {
            String name = args[0];

            int age = Integer.parseInt(args[1]);
            if(age<18 || age>=60)
                throw new MyException("Age should lie between 18 and 60");

            System.out.println("Name = " + name);
            System.out.println("Age = " + age);

        }

        catch (NumberFormatException | InputMismatchException | ArrayIndexOutOfBoundsException | MyException e)
        {
            System.out.println(e);
        }

    }
}
