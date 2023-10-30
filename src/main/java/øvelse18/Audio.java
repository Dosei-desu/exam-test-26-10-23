package øvelse18;

public class Audio extends Media{
    private double loudness; //do you mean Volume?

    public Audio(String name, int duration, double loudness) {
        super(name, duration);
        this.loudness = loudness;
    }

    @Override
    public String toString() {
        return "\""+getName()+"\" : "+getDuration()+"seconds long : "+loudness+"dB";
    }
}
