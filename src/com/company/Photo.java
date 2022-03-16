package com.company;

public class Photo extends HeroesOfHistory {

    public Photo(String Name) {
        super(Name);
    }
    public void toDo(){
        System.out.println(getName() + " свидетельствует в пользу Автора");
    }
    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void authorsActions() {
        System.out.println("Автор делает " + getName() + " с воздуха");
    }

    public static class Lovkach extends HeroesOfHistory{

        public Lovkach(String Name) {
            super(Name);
        }

        public String getName() {
            return Name;
        }

        public void authorsActions() {
            System.out.println("Автор знает об подделке " + getName());
        }

        public void Podd() {
            System.out.println(getName() + " подделывают фото" );
        }
    }

}
