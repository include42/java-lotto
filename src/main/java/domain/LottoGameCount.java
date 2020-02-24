package domain;

public class LottoGameCount {
    public static final String ERROR_NEGATIVE_MESSAGE = "횟수는 0 이하로 입력될 수 없습니다.";
    public static final String ERROR_OUTBOUND_MESSAGE = "입력은 가능 횟수를 초과할 수 없습니다.";
    private int repeat;

    public LottoGameCount(int repeat) {
        validateRepeatCount(repeat);
        this.repeat = repeat;
    }

    private void validateRepeatCount(int repeat) {
        if (repeat < 0) {
            throw new IllegalArgumentException(ERROR_NEGATIVE_MESSAGE);
        }
    }

    public boolean checkLoopTerminate(int count) {
        return count < repeat;
    }

    private void validateSplitValue(int repeat) {
        if (repeat > this.repeat) {
            throw new IllegalArgumentException(ERROR_OUTBOUND_MESSAGE);
        }
    }

    public LottoGameCount splitLottoGameCount(int repeat) {
        validateRepeatCount(repeat);
        validateSplitValue(repeat);
        this.repeat -= repeat;
        return new LottoGameCount(repeat);
    }

    @Override
    public String toString() {
        return String.valueOf(repeat);
    }
}
