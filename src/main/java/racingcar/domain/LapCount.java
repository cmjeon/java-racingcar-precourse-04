package racingcar.domain;

public class LapCount {
    int lapCount;

    public LapCount(int lapCount) {
        if(validateLapCount(lapCount)) this.lapCount = lapCount;
        else throw new IllegalArgumentException();
    }

    private boolean validateLapCount(int lapCount) {
        if(lapCount > 0) return true;
        else return false;
    }

    public int getLapCount() {
        return this.lapCount;
    }
}
