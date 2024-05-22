package org.example.adapter;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        duck1.fly();
        duck1.makeNoise();

        ToyDuck toy1 = new ToyDuck();
        toy1.squeak();

        Sparrow sparrow1 = new Sparrow();
        sparrow1.fly();
        sparrow1.makeNoise();

        BirdPlasticAction toySparrow = new BirdAdapter(sparrow1);
        toySparrow.squeak();
    }
}
