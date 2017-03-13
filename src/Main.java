import java.util.Scanner;

public class Main {

    public static int func1(int con) {
        if (con == 2 || con == 1)
            return 1;
        return func1(con-1) + func1(con-2);
    }

    public static void func2(int con) {
        int num1 =0;
        int num2 =1;
        int sum =0;
        while (num1 +num2 <= con) {
            num1 = num1 + sum;
            sum = num2;
            num2 = num1;
            System.out.print(num1+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - List of N Fibonacci sequence");
        System.out.println("2 - List of N-th Fibonacci sequence");
        int tmp = sc.nextInt();
        switch (tmp) {
            case 1: {
                System.out.print("Input number, condition1: ");
                int con = sc.nextInt();
                System.out.print(0+", ");
                for(int i =1; i<= con; i++) {
                    System.out.print(func1(i)+", ");
                }
                break;
            }
            case 2: {
                System.out.print("Input number, condition2: ");
                int con = sc.nextInt();
                func2(con);
                break;
            }
        }
    }
}

