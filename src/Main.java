public class Main {
    public static void main(String[] args) {
       //System.out.println("Hello world!");
        isMultiple();
    }

    private static long n = 7;
    private static long m = 14;
    private static boolean result;


    public static void isMultiple(){

        if (m % n == 0)
        {
            result = true;
        }

        else{
            result = false;
        }
            System.out.println(result);
        }

    }