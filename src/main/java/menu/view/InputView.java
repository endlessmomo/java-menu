package menu.view;

import menu.dto.CoachNamesDto;
import menu.dto.HateMenusDto;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    private static final String READ_COACH_NAMES_MESSAGE = "코치의 이름을 입력해주세요. (,로 구분)";
    private static final String READ_HATE_MENU_NAMES_MESSAGE = "(이)가 못 먹는 메뉴를 입력해 주세요.";

    private final InputValidator inputValidator = new InputValidator();

    public CoachNamesDto  readCoachNames(){
        System.out.println(READ_COACH_NAMES_MESSAGE);
        String names = readLine();
        inputValidator.validateCoachNames(names);
        return new CoachNamesDto(names);
    }

    public HateMenusDto readHateMenus(Coach coach){
        System.out.println( coach.getName() + READ_HATE_MENU_NAMES_MESSAGE);
        String menus = readLine();
        inputValidator.validateMenuNames(menus);
        return new HateMenusDto(menus);
    }
}
