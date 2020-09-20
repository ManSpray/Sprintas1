package SprintoUzduotis;

public class Employee {
    private String name;
    private String surname;
    private int tabNumber;
    private double salary;

    Employee(){}

    Employee(String va, String ve, int vi, double vu){
        this.name = va;
        this.surname = ve;
        this.tabNumber = vi;
        this.salary = vu;

    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public int getTabNumber(){
        return this.tabNumber;
    }
    public double getSalary(){
        return this.salary;
    }

    public void setName(String name){ this.name = name; }
    public void setSurname(String surname){ this.surname = surname; }
    public void setTabNumber(int tabNumber){ this.tabNumber = tabNumber; }
    public void setSalary(double salary){ this.salary = salary; }



    @Override
    public String toString() {
        return "{ vardas= " + name + ", pavardė= " + surname
                + ", tab number= " + tabNumber + ", salary= " + salary + '}';
    }

}
