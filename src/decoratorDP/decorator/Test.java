package decoratorDP.decorator;

import decoratorDP.composants.Boisson;
import decoratorDP.composants.Sumatra;

public class Test {
    public static void main(String[] args) {

        Boisson boisson;
        boisson = new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}
