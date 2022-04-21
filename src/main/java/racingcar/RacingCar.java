package racingcar;

public class RacingCar {
    public static final int PROGRESS_CONDITION = 4;
    String name;
    int raceProgress;

    public RacingCar(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR]");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getRaceProgress() {
        return this.raceProgress;
    }

    public void race(int number) {
        if (number >= PROGRESS_CONDITION)  this.raceProgress++;
    }
}