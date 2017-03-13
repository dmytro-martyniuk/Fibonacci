import java.util.Scanner;

public class Main {



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
            System.out.print("Input number, condition: ");
                int con = sc.nextInt();
                func2(con);
    }
}

