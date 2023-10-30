package øvelse13;

import java.util.Random;

public class Julegave {
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    public Julegave(){
        Random random = new Random();
        this.isSoft = random.nextBoolean();
        this.isRectangular = random.nextBoolean();
        this.doesRattle = random.nextBoolean();
    }

    public boolean couldBeLego(){
        return !isSoft && isRectangular && doesRattle;
    }

    @Override
    public String toString(){
        return "is it soft? "+isSoft+
                "\nis it rectangular? "+isRectangular+
                "\ndoes it rattle? "+doesRattle;
    }
}
