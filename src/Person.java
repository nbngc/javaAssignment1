public class Person {
    String personCountry = "Nepal";
    int personAge;


    public Person(String name){
        System.out.println("Name is: "+name);
    }
    public void setAge(int age){
        personAge = age;
    }

    public String getPersonCountry() {
        return personCountry;
    }

    public static void main(String[] args) {
        Person person1 = new Person("xyz");
        person1.setAge(22);

        System.out.println("Country is: "+person1.getPersonCountry());
        System.out.println("Age is: "+person1.personAge);
    }
}
