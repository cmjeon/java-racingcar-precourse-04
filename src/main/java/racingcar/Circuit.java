package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Circuit {

    ArrayList<RacingCar> racingCars;
    private int lapCount;

    public Circuit() {

    }

    public ArrayList<RacingCar> getRacingCars() {
        return racingCars;
    }

    public void createRacingCars(String nameString) {
        this.racingCars = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(nameString, ",");
        while(stringTokenizer.hasMoreTokens()){
            this.racingCars.add(new RacingCar(stringTokenizer.nextToken()));
        }
    }

    public void createLapCount(int lapCount) {
        this.lapCount = lapCount;
    }

    public int getLapCount() {
        return this.lapCount;
    }

    public void prepareCircuit() {
        System.out.println("경주할자동차이름(이름은쉼표(,)기준으로구분)");
        String nameString = Console.readLine();
        this.createRacingCars(nameString);
        System.out.println("시도할회수");
        String lapCount = Console.readLine();
        this.createLapCount(Integer.valueOf(lapCount));
    }

    public void runCircuit() {
        System.out.println("RACE START");
        for(int i=0; i<lapCount; i++) {
            this.runLap();
        }
        System.out.println("RACE OVER");
    }

    public void runLap() {
        for(RacingCar racingCar : this.getRacingCars()){
            racingCar.race(Randoms.pickNumberInRange(1, 9));
        }
    }
}
