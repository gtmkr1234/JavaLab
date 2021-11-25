/*Anonymous Nested Class-
* abstract
* interface
* If you do not know the behaviour of any method, declare that method with abstract modifier.
* If a class is having abstract method then it is mandatory to crate the class with abstract modifier.
*
*/
abstract class Result
{
abstract public void calculateResult();
}
//class Second extends Result{
//  public void calculateResult() {
//      System.out.println("Welcome");
//  }
//}
public class TestAnonymousClass {
    public static void main(String[] args) {
        Result obj1=new Result() {
            @Override
            public void calculateResult() {
                System.out.println("Hello");
            }
        };
        Result obj2= new Result() {
            @Override
            public void calculateResult() {
                System.out.println("Hii");
            }
        };
    }
}
