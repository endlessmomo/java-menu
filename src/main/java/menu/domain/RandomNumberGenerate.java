package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerate implements NumberGenerate {
    private static final int MENU_NUMBER_LOWER_BOUND = 1;
    private static final int MENU_NUMBER_UPPER_BOUND = 5;


    @Override
    public int generate() {
        return Randoms.pickNumberInRange(MENU_NUMBER_LOWER_BOUND, MENU_NUMBER_UPPER_BOUND);
    }
}
