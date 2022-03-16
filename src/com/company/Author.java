package com.company;

public class Author extends HeroesOfHistory  {


    public Author(String Name) {
        super(Name);
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void authorsActions() {
        System.out.println(getName() + " засавляет себя начать " + TypeOfEssence.valueOf("рассказ"));
    }
    public void reveal(TypeOfEssence info){
        System.out.println(getName() + " не хочет раскрывать " + info);
    }
    public void listen(TypeOfEssence info) {
        System.out.println(getName() + "а вынуждают прислушаться к его " + info + "ам");
    }
    @Override
    public int hashCode() {
        return super.hashCode()+this.getName().hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
    @Override
    public String toString() {
        return "Герой " + getName();
    }
}
