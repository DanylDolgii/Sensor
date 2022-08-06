package app;

// the observer pattern is used

public class Main {

    public static void main(String[] args) {

        Substance substance = new Substance();

        new ColorSensor(substance);
        new WeightSensor(substance);


        System.out.println("Substance temperature -5 ");
        substance.setState(-5);

        System.out.println("\nSubstance temperature +25 ");
        substance.setState(25);
    }
}
