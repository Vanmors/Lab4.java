package com.company;

public class Ice extends HeroesOfHistory implements SkillsIce {

    public Ice(String Name) {
        super(Name);
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void authorsActions() {
        System.out.println("Автор пытается растопить " +
                "" + getName());
    }

    @Override
    public String toString() {
        return "Герой " + getName();
    }

    @Override
    public void melt() {
        System.out.println(getName() + " таят");
    }
}
