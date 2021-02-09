package com.franktran;

public class Main {

    public static void main(String[] args) {
        Milk milk = new Milk();
        Oranges oranges = new Oranges();

        Box<Milk> boxOfMilk = new Box<>();
        Box<Oranges> boxOfOranges = new Box<>();

        boxOfMilk.add(milk);
        boxOfOranges.add(oranges);

        boxOfMilk.remove().drink();
        boxOfOranges.remove().juggle();
    }
}
