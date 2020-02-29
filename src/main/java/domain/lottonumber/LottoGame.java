package domain.lottonumber;

import domain.LottoGameRepeat;
import domain.lottonumber.generator.LottoGenerator;
import domain.lottoresult.LottoResult;
import domain.lottoresult.LottoWinner;

import java.util.ArrayList;
import java.util.List;

/**
 * LottoGame 클래스는 LottoTicket(6개의 로또번호 세트)의 목록을 가지는 클래스이다.
 * LottoNumbers를 추가하는 메서드와 결과값 생성 메서드를 가진다.
 */
public class LottoGame {
    private List<LottoTicket> lottoTickets = new ArrayList<>();

    public LottoResult makeResult(LottoWinner lottoWinner) {
        LottoResult lottoResult = new LottoResult();
        for (LottoTicket lotto : lottoTickets) {
            lottoResult.add(lottoWinner.createRank(lotto));
        }
        return lottoResult;
    }

    public void makeLottoTickets(LottoGameRepeat gameRepeat, LottoGenerator lottoGenerator) {
        for (int count = 0; gameRepeat.hasRepeat(count); count++) {
            lottoTickets.add(LottoTicketFactory.createLottoTicket(lottoGenerator));
        }
    }

    public void makeLottoTickets(LottoGenerator lottoGenerator) {
        lottoTickets.add(LottoTicketFactory.createLottoTicket(lottoGenerator));
    }

    public List<LottoTicket> getLottoGame() {
        return lottoTickets;
    }
}
