package skaiciuotuvas;

public class StaticCalculator {
    public static void main(String[] args) {
        System.out.println(StaticCalc.add(5, 4));
    }
}

class StaticCalc {
    public static int add (int i, int j){
        return i+j;
    }
}
