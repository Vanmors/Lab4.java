package com.company;

public abstract class HeroesOfHistory extends History{
    String Name;
    public HeroesOfHistory(String Name) {
        this.Name = Name;
        System.out.println("Герой истории " + Name + " успешно созднан");
    }

    abstract public String getName();
    abstract public void authorsActions();


}
