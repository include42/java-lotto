package controller;

import domain.*;
import domain.lottonumber.*;
import domain.lottonumber.generator.LottoGenerator;
import domain.lottonumber.generator.RandomLottoGenerator;
import domain.lottonumber.generator.UserLottoGenerator;
import domain.lottoresult.LottoResult;
import domain.lottoresult.LottoWinner;
import view.InputView;
import view.OutputView;

public class LottoController {
    public void run() {
        Money money = new Money(InputView.inputMoney());
        LottoGame lottoGame = makeLottoGame(money.calculateGames());
        OutputView.printResult(money, makeResult(lottoGame));
    }

    private LottoGame makeLottoGame(LottoGameCount autoGameCount) {
        LottoGame lottoGame = new LottoGame();
        LottoGameCount userGameCount = autoGameCount.splitLottoGameCount(InputView.inputUserRepeat());

        OutputView.printRepeat(userGameCount, autoGameCount);
        makeUserLottoTicket(lottoGame, userGameCount);
        makeAutoLottoTicket(lottoGame, autoGameCount);
        OutputView.printLottoNumbers(lottoGame);

        return lottoGame;
    }


    private void makeUserLottoTicket(LottoGame lottoGame, LottoGameCount userGameCount) {
        OutputView.printUserLottoNumbersFormat();
        for (int count = 0; userGameCount.checkLoopTerminate(count); count++) {
            UserLottoGenerator userNumberGenerator = new UserLottoGenerator(InputView.inputUserLottoNumbers());
            lottoGame.add(LottoTicketFactory.createLottoNumbers(userNumberGenerator));
        }
    }

    private void makeAutoLottoTicket(LottoGame lottoGame, LottoGameCount autoGameCount) {
        LottoGenerator randomLottoGenerator = new RandomLottoGenerator();
        for (int count = 0; autoGameCount.checkLoopTerminate(count); count++) {
            lottoGame.add(LottoTicketFactory.createLottoNumbers(randomLottoGenerator));
        }
    }

    private LottoResult makeResult(LottoGame lottoGame) {
        UserLottoGenerator userNumberGenerator = new UserLottoGenerator(InputView.inputWinnerNumbers());
        LottoTicket winnerNumbers = LottoTicketFactory.createLottoNumbers(userNumberGenerator);
        LottoNumber bonus = LottoNumberFactory.getLottoNumber(InputView.inputBonusNumber());

        return lottoGame.makeResult(new LottoWinner(winnerNumbers, bonus));
    }
}
