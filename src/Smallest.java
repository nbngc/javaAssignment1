import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        findSmallest(num1, num2, num3);


    }
    static  void findSmallest(int num1, int num2, int num3){
        if (num1<=num2 && num1<=num3){
            System.out.println(num1+ " is the smallest");
        }
        else if(num2<=num3 && num2<=num3){
            System.out.println(num2+" is the smallest");
        }
        else{
            System.out.println(num3+" is the smallest");
        }

    }
}
