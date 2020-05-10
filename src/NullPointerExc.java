public class NullPointerExc {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }
        //An object of this class gets created whenever a member is invoked with a “null” object
        catch(NullPointerException e){
            System.out.println("NullPointerException Incurred");
        }
    }
}

