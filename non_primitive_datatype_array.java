import java.util.*;
class student{
    int Rollno;
    String name;
    int[] marks;
    Scanner inp= new Scanner(System.in);
    student(){
        System.out.println("Enter the Roll no of the student");
        Rollno=inp.nextInt();
        System.out.println("Enter the name of the student");
        inp.nextLine();
        name=inp.nextLine();
        System.out.println("Enter the marks of "+ name);
        marks= new int[5];
        for(var i=0; i<marks.length; i++){
            marks[i]= inp.nextInt();
        }
    }
    public void display(){
        System.out.println("The Roll No. of the student is :" + Rollno);
        System.out.println("Name of student : "+name);
        System.out.println("The marks of "+name+" are:");
        for(int res: marks){
            System.out.println(res);
        }
        System.out.println(" ");
    }
}
class Stumain{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the no. of students:");
        int n=inp.nextInt();
        student arr[]=new student[n];
        for(var i=0; i<arr.length; i++){
            arr[i]= new student();
        }
        for (student student : arr) {
            student.display();
        }
    }
}
