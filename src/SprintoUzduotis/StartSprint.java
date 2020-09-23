package SprintoUzduotis;

import java.io.*;
import java.util.Scanner;


public class StartSprint {

    public static void main(String[] args) {

        String csvFile = "./data/employees.csv";

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(csvFile), true));

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter new Employee Name, " +
                    "Surname, Tab number and salary.\nExample.: Wick, Birdman, 0007, 2000.20");

            String NewEmployee = myObj.nextLine();  // Read user input
//            System.out.println("Username is: " + userName);  // Output user input
            String fileLine = "\n"+NewEmployee;
            bufferedWriter.write(fileLine);
            bufferedWriter.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        String line = "";
        String cvsSplitBy = ", ";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//            int count = 0;
            while ((line = br.readLine()) != null) {
                // use comma and space as separator
                String[] emp = line.split(cvsSplitBy);
                Employee emp1 = new Employee(emp[0], emp[1], Integer.parseInt(emp[2]), Double.parseDouble(emp[3]));
//                setName(emp[0]);
                System.out.println(emp1.toString());
//                System.out.println("[Salary: " + emp[3] + ", ID: " + emp[2] + ", name: " + emp[0] + " , surname:" + emp[1] + "]");
//                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
class Employee {
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