package øvelse18;

public class Video extends Media{
    private String aspectRation;

    public Video(String name, int duration, String aspectRation) {
        super(name, duration);
        this.aspectRation = aspectRation;
    }

    @Override
    public String toString() {
        return "\""+getName()+"\" : "+getDuration()+"seconds long : "+aspectRation;
    }
}
