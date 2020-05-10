public class StringOutofBoundExc {
    public static void main(String args[])
    {
        try{
            String str="introtoalgorithms";
            System.out.println(str.length());;
            char c = str.charAt(0);
//            an index is invoked of a string, which is not in the range.
            c = str.charAt(40);
            System.out.println(c);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException!!");
        }
    }
}
