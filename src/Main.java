public class Main {
    public static void main(String[] args) {
       //System.out.println("Hello world!");
        boolean x = isMultiple(14,7);
        System.out.println(x);
    }

    public static boolean isMultiple(long n, long m){

        if (n % m == 0){
            return true;
        }

        else{
            return false;
       }
    }
}