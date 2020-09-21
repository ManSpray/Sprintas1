package experiment;

public class Uzduotis1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Mantas";
        person1.surname = "Mantaitis";
        person1.age = 25;

        Person person2 = new Person("Tomas", "Tomenas");
        person2.setAge(29);

        System.out.println(person1.name + " " + person1.surname + " " + person1.age);
        System.out.println(person2.name + " " + person2.surname + " " + person2.age);
    }
}
class Person {
    //fieldai laukai savybes
    String name;
    String surname;
    int age;

    //konstruktoriai
    public Person(){ }

    public Person(String n, String s){
        this.name = n;
        this.surname = s;
    }

    //
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age <= 0 || age > 125){
            System.out.println("Please provide correct age!");
        } else {
            this.age = age;
        }
    }
}
