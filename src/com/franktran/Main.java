package com.franktran;

public class Main {

    public static void main(String[] args) {
        Milk milk = new Milk();
        Oranges oranges = new Oranges();

        Box boxOfMilk = new Box();
        Box boxOfOranges = new Box();

        boxOfMilk.add(oranges);
        boxOfOranges.add(milk);

        ((Milk)boxOfMilk.remove()).drink();
        ((Oranges)boxOfOranges.remove()).juggle();
    }
}
