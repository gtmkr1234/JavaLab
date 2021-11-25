public class Demo2 {
    public static void value(int arr[]) {
        for(int res:arr){
            arr[3]=45000;
            System.out.println(res);
            // This method copies the reference of the element of the array
        }

    }

    public static void main(String[] args) {
        int ar1[]={15,45,56,78};
        value(ar1);
        value(new int[]{23,45,87,98,55});//Implementation of nameless array
    }
}
