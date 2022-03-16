package com.company;

public class Main {

    public static void main(String[] args) throws StartException, ScannerException {
        History history = new History();
        history.beginning();
        if (!history.startStory ) {
            throw new StartException("История ещё не начата");
        }
            Author author = new Author("Автор");
            Minerals minerals = new Minerals("Полезные ископаемые");
            Ice ice = new Ice("Вечные льды");
            Photo photo = new Photo("фото");
            Photo.Lovkach lovkach = new Photo.Lovkach("ловкачи");
            ArtСritics artСritics = new ArtСritics("Искусствоведы");
            SkillsDoubters doubters = new SkillsDoubters() {
                @Override
                public void willBe() {
                    System.out.println("Сомневающиеся найдутся");
                }
            };

            System.out.println();
            author.authorsActions();
            author.reveal(TypeOfEssence.причины);
            author.listen(TypeOfEssence.совет);
            ice.authorsActions();
            minerals.authorsActions();
            ice.melt();
            minerals.toBe();
            System.out.println();

            doubters.willBe();
            artСritics.toDo();
            photo.authorsActions();
            photo.toDo();
            lovkach.Podd();
            lovkach.authorsActions();
            history.ending();
    }
}
