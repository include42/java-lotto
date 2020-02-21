package domain.lottonumber.generator;

import domain.lottonumber.LottoNumber;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumberGenerator implements NumberGenerator {
    private static final List<LottoNumber> numbers;
    private static final int LOTTO_UNDER_BOUND = 1;
    private static final int LOTTO_UPPER_BOUND = 45;

    static {
        numbers = IntStream.range(LOTTO_UNDER_BOUND, LOTTO_UPPER_BOUND + 1)
                .mapToObj(LottoNumber::of)
                .collect(Collectors.toList());
    }

    @Override
    public SortedSet<LottoNumber> create() {
        Collections.shuffle(numbers);
        return new TreeSet<>(numbers.subList(0, 6));
    }
}
