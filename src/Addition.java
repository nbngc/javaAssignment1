import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = sc.nextInt();

        System.out.println("Enter second number:");
        num2 = sc.nextInt();

        findAddition(num1, num2);
    }
    static void findAddition(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
