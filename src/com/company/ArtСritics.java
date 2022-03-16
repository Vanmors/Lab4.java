package com.company;

import java.util.Objects;
import java.util.Scanner;

public class ArtСritics extends HeroesOfHistory{

    public ArtСritics(String Name) {
        super(Name);
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void authorsActions() {
        System.out.println("Автор думает об " + getName());
    }
    public void toDo() throws ScannerException {
        class Thinking {
            Scanner sc = new Scanner(System.in);
            String head = sc.nextLine();

            public void brainstorm() throws ScannerException {
                if (!Objects.equals(head, "голову")) {
                        throw new ScannerException("Слово введено неправильно");
                }
                System.out.println(getName() + " ломают " + head);
            }
        }
        Thinking thinking = new Thinking();
        thinking.brainstorm();
    }
}
