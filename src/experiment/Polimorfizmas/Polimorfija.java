package experiment.Polimorfizmas;

public class Polimorfija {
    public static void main(String[] args) {

        Person[] people = new Person[2];
        people[0] = new Person();
        people[1] = new Employee();

        for (int i = 0; i < people.length; i++){
            people[i].doSomething();
        }

    }
}

class Person {
    String name;
    String surname;
    int age;
    public void doSomething(){
        System.out.println("lallala");
    }
}
class Employee extends Person {
    String TabNumber;
}
class Janitor extends Employee {
    double salary;
}
