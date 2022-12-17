package menu.view;

import java.util.Arrays;

public class InputValidate {
    private static final String COACH_NAMES_DELIMITER = ",";
    private static final String MENU_NAMES_DELIMITER = ",";
    private static final String WHITE_SPACE = " ";
    private static final int COACH_LOWER_BOUND = 2;
    private static final int COACH_NAME_MIN_LENGTH = 2;
    private static final int COACH_NAME_MAX_LENGTH = 4;
    private static final int MENU_COUNT_UPPER_BOUND = 2;
    private static final String INVALID_COACH_COUNT = "코치는 최소 2명 이상 입력해야 합니다.";
    private static final String INVALID_MENU_COUNT = "못 먹는 메뉴는최대 2개까지 입력이 가능합니다.";

    public void validateCoachNames(String names){
        if(isInvalidCoachNames(names)){
            throw new IllegalArgumentException(INVALID_COACH_COUNT);
        }
    }

    private boolean isInvalidCoachNames(String names){
        return Arrays.stream(names.split(COACH_NAMES_DELIMITER))
                .anyMatch(this::isInvalidCoachName);
    }

    private boolean isInvalidCoachName(String name){
        return name.isBlank() || name.contains(WHITE_SPACE) || name.length() > COACH_NAME_MAX_LENGTH || name.length() < COACH_NAME_MIN_LENGTH;
    }

    public void validateMenuNames(String names){
        if(isInvalidMenuNames(names)){
            throw new IllegalArgumentException(INVALID_MENU_COUNT);
        }
    }

    private boolean isInvalidMenuNames(String names){
        return Arrays.stream(names.split(MENU_NAMES_DELIMITER))
                .count() > MENU_COUNT_UPPER_BOUND;
    }
}
