import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        float principle, time, rate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle:");
        principle = sc.nextFloat();

        System.out.println("Enter the time:");
        time = sc.nextFloat();

        System.out.println("Enter the rate");
        rate = sc.nextFloat();

        findInterest(principle,time,rate);
    }
    static void findInterest(float p, float t, float r){
        float interest = (p * t * r) / 100;
        System.out.println("Interest on "+p+" for "+t+" years at the rate of "+r+" % is "+interest);
    }
}

