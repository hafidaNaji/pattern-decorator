package deco;

import boissons.Boisson;

public class Chantier extends DecorateurBoisson{
    public Chantier(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+"  Au Chantier";
    }

    @Override
    public double cout() {
        return 0.8 + boisson.cout();
    }
}
