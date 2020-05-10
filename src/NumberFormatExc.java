//This exception occurs when a string is parsed to any numeric variable
public class NumberFormatExc {
    public static void main(String args[])
    {
        try{
            //String xyz cannot be parsed into to integer
            int num=Integer.parseInt ("XYZ") ;
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Number format exception occurred");
        }
    }
}
