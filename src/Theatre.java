public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!\n");

        Actor actor1 = new Actor("Кирилл", "Петров", Gender.MALE, 188);
        Actor actor2 = new Actor("Ольга", "Смирнова", Gender.FEMALE, 178);
        Actor actor3 = new Actor("Андрей", "Волков", Gender.MALE, 192);

        Director director1 = new Director("Елена", "Захарова", Gender.FEMALE, 5);
        Director director2 = new Director("Максим", "Фёдоров", Gender.MALE, 15);

        MusicalShow musicalShow = new MusicalShow("Хроники светового ветра", 90, director1, "Фёдоров Максим", "пу-пу-пу");
        Opera opera = new Opera("Тени над проливом", 150, director1, "Фёдоров Максим", "пу-пу-пу", 100);
        Ballet ballet = new Ballet("Шёпот шёлка и камня", 110, director2, "Фёдоров Максим", "пу-пу-пу", "Лебедева Анна");
        Show show = new Show("Шоу", 80, director2);

        musicalShow.addActor(actor1);
        opera.addActor(actor3);
        opera.addActor(actor2);
        ballet.addActor(actor1);
        ballet.addActor(actor3);
        show.addActor(actor1);
        show.addActor(actor2);

        musicalShow.printActors();
        musicalShow.printDirector(director1);
        opera.printActors();
        opera.printDirector(director1);
        ballet.printActors();
        ballet.printDirector(director2);
        show.printActors();
        show.printDirector(director2);


        show.replaceActor(actor1, "Смирнова");

        show.replaceActor(actor2, "Фёдоров");

        System.out.println("Либретто балета \"" + ballet.getTitle() + "\":");
        ballet.printLibretto();
        System.out.println("Либретто оперы \"" + opera.getTitle() + "\":");
        opera.printLibretto();
    }
}
