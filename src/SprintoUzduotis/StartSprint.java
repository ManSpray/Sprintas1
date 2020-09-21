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
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            int count = 0;
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] emp = line.split(cvsSplitBy);
//                System.out.println(emp[count].toString());
                System.out.println("[Salary: " + emp[3] + ", ID: " + emp[2] + ", name: " + emp[0] + " , surname:" + emp[1] + "]");
//                count++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}