package experiment;

public class paskaita1 {
    public static void main(String[] args){
        Employee employee1 = new Employee();
        employee1.name = "Mindaugas";
        employee1.surname = "Mindaugaitis";

        Employee employee2 = new Employee();
        employee2.name = "Jonas";
        employee2.surname = "Jonaitis";

        Employee employee3 = new Employee();
        employee3.name = "Vardenis";
        employee3.surname = "Pavardenis";

        Employee employee4 = new Employee("Tomas", "Tomaitis");
        employee4.setAge(50);

        Employee employee5 = new Employee("Kęstas", "Kęstaitis");
        employee5.setAge(150);

        System.out.println("Darbuotojo vardas: " + employee1.name + ", pavardė: " + employee1.surname);
        System.out.println("Darbuotojo vardas: " + employee2.name + ", pavardė: " + employee2.surname);
        System.out.println("Darbuotojo vardas: " + employee3.name + ", pavardė: " + employee3.surname);
        System.out.println("Darbuotojo vardas: " + employee4.name
                + ", pavardė: " + employee4.surname
                + ", amžius: " + employee4.getAge());
        System.out.println("Darbuotojo vardas: " + employee5.name
                + ", pavardė: " + employee5.surname
                + ", amžius: " + employee5.getAge());
    }
}
class Employee {
    String name;
    String surname;
    int age;

    public Employee(){ }

    public Employee(String n, String s){
        this.name = n;
        this.surname = s;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        if(age <= 0 || age > 125){
            System.out.println("Please provide correct age!");
        } else {
            this.age = age;
        }
    }
}
