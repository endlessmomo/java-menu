package menu.domain;

import java.util.Arrays;

public enum Category {
    KOREAN_FOOD(1, "한식"),
    JAPANESE_FOOD(2, "일식"),
    WESTERN_FOOD(3, "양식"),
    CHINESE_FOOD(4, "중식"),
    ASIAN_FOOD(5, "아시안");

    private static final String INVALID_NUMBER_RANGE = "종류는 1~5까지 밖에 없습니다";

    private final int menuStyleNum;
    private final String menuStyle;

    Category(int menuStyleNum, String menuStyle) {
        this.menuStyleNum = menuStyleNum;
        this.menuStyle = menuStyle;
    }

    public static String toCategory(int randomNum){
        return Arrays.stream(values())
                .filter(category -> category.menuStyleNum == randomNum)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(INVALID_NUMBER_RANGE))
                .menuStyle;

    }
}
