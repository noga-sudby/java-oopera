public class MusicalShow extends Show {

    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
    String balletLibrettoText = "Абстрактная история о встрече двух миров.\n";
    String operaLibrettoText = "Действие происходит в приморском городе на стыке культур.\n";

    public void printLibretto() {
        System.out.println(librettoText);
    }
}
