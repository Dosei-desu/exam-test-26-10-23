package øvelse18;

public abstract class Media {
    private String name;
    private int duration;

    public Media(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }
}
