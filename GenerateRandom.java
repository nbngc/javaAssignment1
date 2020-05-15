import java.util.concurrent.ThreadLocalRandom;
class ThreadX extends Thread {
    @Override
    public void run() {
        System.out.println("Negative Number");
    }
}
class ThreadY extends Thread {
    @Override
    public void run() {
        System.out.println("Even Number");
    }
}
class ThreadZ extends Thread {
    @Override
    public void run() {
        System.out.println("Odd Number");
    }
}

public class GenerateRandom {

    public static void main(String args[]) {
            // Generate ten random integers
            for (int i = 1; i <= 10; i++) {
                int rand_int = ThreadLocalRandom.current().nextInt();


                if(rand_int < 0){

                    ThreadX x = new ThreadX();
//                    Thread n1 = new Thread(x);
                    x.start();

                }

                else if (rand_int % 2 ==0){


                    ThreadY y = new ThreadY();
//                    Thread n2 = new Thread(y);
                    y.start();
                }

                else if(rand_int % 2 ==1){

                    ThreadZ z = new ThreadZ();
//                    Thread n3 = new Thread(z);
                    z.start();


                }
                System.out.println(rand_int);

            }
        }
    }