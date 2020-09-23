package experiment.Interfaces;

import java.util.Arrays;

public class SortWithPolyInterface {
    static void sort(CustomComparable[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {
            for (int kidx = 0; kidx < arr.length - 1 - k; kidx++) {
                if (!arr[kidx].compare(arr[kidx + 1])) {
                    CustomComparable temporary = arr[kidx + 1];
                    arr[kidx + 1] = arr[kidx];
                    arr[kidx] = temporary;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Užduotis, su savo parašytu rikiavimo metodu išrikiuokite masyvą custom objektų
        Vehicle[] carPark = {
                new Vehicle(15261),
                new Vehicle(545646),
                new Vehicle(794),
                new Vehicle(454515)
        };
        System.out.println("Before sorting: " + Arrays.toString(carPark));
        sort(carPark);
        System.out.println("After sorting: " + Arrays.toString(carPark));

        Cat[] cats = {
                new Cat(55),
                new Cat(12),
                new Cat(66)
        };
        System.out.println("Before sorting: " + Arrays.toString(cats));
        sort(cats);
        System.out.println("After sorting: " + Arrays.toString(cats));

        Janitor[] janitors = {
                new Janitor(5532),
                new Janitor(525),
                new Janitor(2341)
        };
        System.out.println("Before sorting: " + Arrays.toString(janitors));
        sort(janitors);
        System.out.println("After sorting: " + Arrays.toString(janitors));
    }
}

interface CustomComparable {
    boolean compare(CustomComparable o);
}

class Vehicle implements CustomComparable {
    int price;
    public Vehicle(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "{ price : " + price + " }";
    }

    @Override
    public boolean compare(CustomComparable v) {
        // car1.compare(car2)
        return this.price < ((Vehicle)v).price;
    }
}

class Cat implements CustomComparable {
    int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{ age : " + age + " }";
    }

    @Override
    public boolean compare(CustomComparable c) {
        return this.age < ((Cat)c).age;
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
class Janitor extends Employee implements CustomComparable {
    int salary;

    public Janitor(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{ salary : " + salary + " }";
    }
    @Override
    public boolean compare(CustomComparable o) { return this.salary < ((Janitor)o).salary; }
}
