
interface interface1 {
    //default method
    default void show()
    {
        System.out.println("Default interface 1");
    }
}

interface interface2{
    //default method
    default void display(){
        System.out.println("Default interface 2");
    }
}


class MultipleInheritance implements interface1, interface2 {
    //overriding default show and display method

    @Override
    public void display() {
        //using super to call the show method of interface1
        interface1.super.show();
    }

    @Override
    public void show() {
        interface2.super.display();
    }

    public static void main(String[] args) {
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.show();
        multipleInheritance.display();

    }
}