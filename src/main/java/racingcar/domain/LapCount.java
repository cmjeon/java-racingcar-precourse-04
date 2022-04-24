package racingcar.domain;

public class LapCount {
    int lapCount;
    public static final int MIN_LAP_COUNT_LENGTH = 1;

    public LapCount(int lapCount) {
        if(validateLapCount(lapCount)) {
            this.lapCount = lapCount;
            return;
        }
        throw new IllegalArgumentException("[ERROR] lapCount Size");
    }

    private boolean validateLapCount(int lapCount) {
        if(MIN_LAP_COUNT_LENGTH <= lapCount) return true;
        else return false;
    }

    public int getLapCount() {
        return this.lapCount;
    }
}
