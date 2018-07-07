package pl.infoshare.structures._2_lists._4_exercise;

public class Slide {

    String name;
    String tekst;

    public Slide(String name, String tekst) {
        this.name = name;
        this.tekst = tekst;
    }

    @Override
    public String toString() {
        return "Slide{" +
                "name='" + name + '\'' +
                ", tekst='" + tekst + '\'' +
                '}';
    }
}
