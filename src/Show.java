import java.util.ArrayList;

public class Show {

    public String getTitle() {
        return title;
    }

    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printActors() {
        System.out.println("Актёры спектакля \"" + title + "\":");

        if (listOfActors.isEmpty()) {
            System.out.println("Нет актёров");
            return;
        }

        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void printDirector(Director director) {
        System.out.println("Режиссёр:");
        System.out.println(director);
        System.out.println();
    }

    public void addActor(Actor actor) {
        if (actor == null) {
            System.out.println("Некорректные данные для добавления");
            return;
        }
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр уже участвует в спектакле!");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor newActor, String surname) {
        if (newActor == null || surname == null) {
            System.out.println("Некорректные данные для замены");
            return;
        }
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor current = listOfActors.get(i);
            if (current.getSurname().equalsIgnoreCase(surname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр " + surname + " успешно заменён\n");
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surname + " не найден в спектакле\n");
    }
}
