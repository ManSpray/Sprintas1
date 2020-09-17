package sprintas.Dog;
import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Bonė", "Čiau Čiau");
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();

        dog1.setVardas("Džimas");
        dog1.setVeisle("Vokiečių aviganis");
        dog3.setVardas("Mykošiukas");
        dog3.setVeisle("Taksas");

        Scanner sc = new Scanner(System.in);
        dog4.setVardas(sc.nextLine());
        dog4.setVeisle(sc.nextLine());

        System.out.println(dog1.getVardas() + " " +  dog1.getVeisle());
        System.out.println(dog2.getVardas() + " " + dog2.getVeisle());
        System.out.println(dog3.getVardas() + " " + dog3.getVeisle());
        System.out.println(dog4.getVardas() + " " + dog4.getVeisle());

        //Objektų masyvai
        Dog[] dogs = new Dog[2];
        dogs[0] = dog4;
        dogs[1] = new Dog("Lapė", "Lenciūginis");

        Dog[] dogs2 = {
                dog1,
                dog2,
                new Dog("Jack", "Daniels")
        };


        System.out.println("Dogs array contains: " + Arrays.toString(dogs));
    }
}


