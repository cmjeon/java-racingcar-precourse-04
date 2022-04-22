package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CircuitTest {

    Circuit testPrepareCircuit() {
        Circuit circuit = new Circuit();
        String nameString = "alpha,bravo,delta";
        circuit.createRacingCars(nameString);
        int lapCount = 5;
        circuit.createLapCount(lapCount);
        return circuit;
    }

    @Test
    @DisplayName("서킷은 부여받은 문자열로 레이싱카를 만든다")
    void 서킷은_부여받은_문자열로_레이싱카를_만든다() {
        Circuit circuit = testPrepareCircuit();
        assertThat(circuit.getRacingCars().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("서킷은 부여받은 숫자로 주행바퀴수를정한다")
    void 서킷은_부여받은_숫자로_주행바퀴수를_정한다() {
        Circuit circuit = testPrepareCircuit();
        assertThat(circuit.getLapCount()).isEqualTo(5);
    }

    @Test
    @DisplayName("서킷을 준비할 때 레이싱카 이름과 주행바퀴수를 입력받는다")
    void 서킷을_준비할_때_레이싱카_이름과_주행바퀴수를_입력받는다() {
        Circuit circuit = new Circuit();
        circuit.prepareCircuit();
        assertThat(circuit.getRacingCars()).isNotEmpty();
        assertThat(circuit.getLapCount()).isGreaterThan(0);
    }

    @Test
    @DisplayName("서킷은 주행바퀴를 돌 때마다 레이싱카에 랜덤값을 부여한다")
    void 서킷은_주행바퀴를_돌_때마다_레이싱카에_랜덤값을_부여한다() {
        Circuit circuit = testPrepareCircuit();
        circuit.runCircuit();
        assertThat(circuit.getRacingCars().get(0).getRaceProgress()).isGreaterThan(0);
    }

    @Test
    @DisplayName("서킷은 주행을 마치면 주행의 승리자를 결정한다")
    void 서킷은_주행을_마치면_주행의_승리자를_결정한다() {
        Circuit circuit = testPrepareCircuit();
        circuit.runCircuit();
    }
}
