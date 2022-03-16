package com.company;

public class Minerals extends HeroesOfHistory implements SkillsMinerals{
    public Minerals(String Name) {
        super(Name);
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void authorsActions() {
        System.out.println("Автор ищет " + getName());

    }

    @Override
    public String toString() {
        return "Герой " + getName();
    }
    @Override
    public void toBe() {
        System.out.println(getName() + " находятся");
    }


}
