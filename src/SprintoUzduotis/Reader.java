package SprintoUzduotis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) {

        String csvFile = "./data/employees.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] emp = line.split(cvsSplitBy);


                System.out.println("Salary: " + emp[3] + ", identification number: " + emp[2] + ", name: " + emp[0] + " , surname:" + emp[1] + "]");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}