package sprintas.Dog;

public class Dog {
    private String vardas;
    private String veisle;

    Dog(){}

    Dog(String va, String ve){
        this.vardas = va;
        this.veisle = ve;
    }

    public String getVardas(){
        return this.vardas;
    }
    public String getVeisle(){
        return this.veisle;
    }

    public void setVardas(String vardas){ this.vardas = vardas; }
    public void setVeisle(String veisle){ this.veisle = veisle; }

    @Override
    public String toString() {
        return "{ vardas= " + vardas + ", veisle= " + veisle + '}';
    }
}
