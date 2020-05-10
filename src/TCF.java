public class TCF {
    public static void main(String[] args) {
        int[] arr = new int[4];

        try{
            int i = arr[4];
            //Following line wont execute as exception is raised by above statement
            System.out.println("Inside try block");
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in catch block");
        }
        finally {
            System.out.println("Finally block executed");
        }
    //Rest of the program
        System.out.println("Outside try-catch-finally block");
    }
}
