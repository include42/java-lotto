package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class RepeatCountTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 10, 20})
    void 생성_테스트(int value) {
        RepeatCount repeatCount = new RepeatCount(value);
        Assertions.assertThat(repeatCount).hasFieldOrPropertyWithValue("repeat", value);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, -200})
    void 생성_예외_테스트(int value) {
        Assertions.assertThatThrownBy(() -> new RepeatCount(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("횟수는 0 이하로 입력될 수 없습니다.");
    }

    @ParameterizedTest
    @CsvSource(value = {"10,true", "5,true", "0,false"})
    void 생성_예외_테스트(int value, boolean exp) {
        RepeatCount repeatCount = new RepeatCount(5);
        Assertions.assertThat(repeatCount.checkLoopTerminate(value)).isEqualTo(exp);
    }
}
