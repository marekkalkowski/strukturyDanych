package pl.infoshare.structures._2_lists._4_exercise;

import java.util.ArrayList;
import java.util.List;

public class SlideShow {

    List<Slide> slideList = new ArrayList<>();
    private int i = 0;

    public SlideShow(){
        slideList.add(new Slide("fisrt slide", "tekst pierwszy"));
        slideList.add(new Slide("second slide", "tekst drugi"));
        slideList.add(new Slide("third slide", "tekst tzreci"));
        slideList.add(new Slide("czwarty slide", "tekst czwarty"));
    }

    @Override
    public String toString() {
        return "SlideShow{" +
                "slideList=" + slideList +
                '}';
    }



    public void start (){
        System.out.println(slideList.get(i));

        }





    public void currentSlide(int index){
        System.out.println(slideList.get(index));
        System.out.println("aktualny slide to " + index);
    }

    public void showNext () {
        i++;
        System.out.println(slideList.get(i));

    }

    public void showPrivius () {
        i--;
        System.out.println(slideList.get(i));

    }
}
