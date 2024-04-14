import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> arr = new ArrayList<>();
    static int fibNum = 0;
    static int fibonacciNum = 0;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num = keyboard.nextInt();

        arr.add(0,1);
        arr.add(1,1);

        if(num < 5 || num > 40){
            return;
        }

        fib(num);
        fibonacci(num);

        System.out.println(fibNum + " " + fibonacciNum);


    }

    private static int fib(int num) {
        if(num == 1 || num == 2) {
            fibNum++;
            return 1;
        }

        return fib(num-1) + fib(num-2);
    }

    private static void fibonacci(int num)
    {

        for(int i = 2; i< num; i++ )
        {
            arr.add(i,arr.get(i-1)+arr.get(i-2));
            fibonacciNum++;
        }

    }


}
