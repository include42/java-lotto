package domain.lottonumber;

import java.util.*;

public class LottoTicket {
    private static final String ERROR_NULL_MESSAGE = "null값이 입력되었습니다.";
    private static final String ERROR_INVALID_SIZE_MESSAGE = "인자의 갯수가 올바르지 않습니다.";
    private static final int LOTTO_SIZE = 6;

    private SortedSet<LottoNumber> lottoNumbers;

    public LottoTicket(SortedSet<LottoNumber> lottoNumbers) {
        validateNullValue(lottoNumbers);
        validateSize(lottoNumbers);
        this.lottoNumbers = lottoNumbers;
    }

    private void validateSize(SortedSet<LottoNumber> lottoNumbers) {
        if (lottoNumbers.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException(ERROR_INVALID_SIZE_MESSAGE);
        }
    }

    private void validateNullValue(SortedSet<LottoNumber> lottoNumbers) {
        if (Objects.isNull(lottoNumbers)) {
            throw new IllegalArgumentException(ERROR_NULL_MESSAGE);
        }
    }

    public boolean contains(LottoNumber lottoNumber) {
        return lottoNumbers.contains(lottoNumber);
    }

    public int calculateMatchNumber(LottoTicket comparedLottoTicket) {
        return (int) lottoNumbers.stream()
                .filter(comparedLottoTicket::contains)
                .count();
    }

    public SortedSet<LottoNumber> getLottoNumbers() {
        return lottoNumbers;
    }
}
