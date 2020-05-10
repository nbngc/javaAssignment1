class PersonInheritance {

    private String name;
    private double baseSalary = 50000;
    private double bonusSalary;

    public PersonInheritance() {
    }

    public PersonInheritance(String name, double bonusSalary){
        this.name = name;
        this.bonusSalary = bonusSalary;
        System.out.println("Name: "+name);
        System.out.println("Total Salary: "+(baseSalary+this.bonusSalary));
    }
//    public double calculateSalary(double bonusSalary){
//        return (baseSalary + bonusSalary);
//
//    }

}
class Politician extends PersonInheritance{

    public Politician(String name,double bonusSalary) {
        super(name, bonusSalary);
    }

    public Politician() {
    }
}
class Sportsman extends PersonInheritance{

    public Sportsman(String name,double bonusSalary){
        super(name,bonusSalary);
    }

    public Sportsman() {
    }
}
class Main {
    public static void main(String[] args) {
//        Politician politician1 = new Politician();
        Politician politician = new Politician("xyz",20000);
//        System.out.println("Total Salary: "+politician.calculateSalary(10000));
//        Sportsman sportsman1 = new Sportsman();
        Sportsman sportsman = new Sportsman("uuu",10000);
//        System.out.println("Total Salary: "+sportsman.calculateSalary(50000));

    }
}