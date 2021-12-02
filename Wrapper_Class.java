public class KrishnaLab {
    public static void main(String[] args) {
        Integer i1 = 55;
        // background process is Integer i1 = Integer.valueof(55);
        int res = i1;
        //Unboxing process
        //Background process - int res = i1.intValue();
        System.out.println(res);
    }
}
class main {
    public static void main(String[] args) {
        Integer i2 = 4565;
        String res = i2.toString();
        System.out.println(res+4);

    }
}

class Test{
    public static void main(String[] args) {
        String s = "123";
        int i = Integer.parseInt(s);
        System.out.println(i+8);
        //parseInt() is a static method.
    }
}

class Test78{
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1==i2);

    }
}
