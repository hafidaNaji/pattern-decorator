package net.naji;

import boissons.Boisson;
import boissons.Espresso;
import boissons.Sumatra;
import deco.Chantier;
import deco.Chocolat;
import deco.Noisette;

public class Main {
    public static void main(String[] args) {
        Boisson boisson = new Chantier(new Chocolat(new Noisette(new Noisette(new Espresso()))));
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

    }
}