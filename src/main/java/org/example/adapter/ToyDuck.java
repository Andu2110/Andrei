package org.example.adapter;

public class ToyDuck implements BirdPlasticAction{
    @Override
    public void squeak() {
        System.out.println("Toy duck makes: Any sound");
    }
}
