package racingcar;

public class RacingCar {
    Name name;
    RaceProgress raceProgress;

    public RacingCar(String name) {
        this.name = new Name(name);
        this.raceProgress = new RaceProgress();
    }

    public String getName() {
        return this.name.getName();
    }

    public int getRaceProgress() {
        return this.raceProgress.getProgress();
    }

    public void race(int number) {
        this.raceProgress.forwardProgress(number);
    }
}