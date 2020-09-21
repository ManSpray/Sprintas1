package experiment.paveldimumasNamuDarbas;

public class AppF {
    public static void main(String[] args) {
        Pupkin pupkin1 = new Pupkin(15.5 , 5.4, 0.99);
        System.out.println(pupkin1.diameter);


    }
}

class Food {
    String type;
    String color;
}
class Vegetables extends Food {
    String name;
    boolean green;
}
class Pupkin extends Vegetables {
    double diameter;
    double weight;
    double price;

    public Pupkin(double diameter, double weight, double price) {
        this.diameter = diameter;
        this.weight = weight;
        this.price = price;
    }
}
//class Cabbage extends Vegetables {
//    double price;
//}

//class Fruits extend Food {
//    String name;
//    boolean treeFruit;
//}
//class Cherry extend Fruits {
//    String color;
//    double price;
//}


