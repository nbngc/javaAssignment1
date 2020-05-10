interface AnimalEats{
    void eat();
}
interface AnimalTravels{
    void travel();
}

class Animal implements AnimalEats, AnimalTravels{
    //overriding interface methods for multiple inheritance
    @Override
    public void eat() {
        System.out.println("Animal is Eating");
    }

    @Override
    public void travel() {
        System.out.println("Animal is travelling");
    }
}
public class MultipleInheritance2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.travel();
        }
    }


