package menu.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public enum Category {
    KOREAN_FOOD(1, "한식"),
    JAPANESE_FOOD(2, "일식"),
    WESTERN_FOOD(3, "양식"),
    CHINESE_FOOD(4, "중식"),
    ASIAN_FOOD(5, "아시안");


    private static final int CATEGORY_INDEX_LOWER_BOUND = 1;
    private static final int CATEGORY_INDEX_UPPER_BOUND = 5;
    private static final int INVALID_CATEGORY_SIZE = 2;
    private static final int CATEGORY_SIZE_UPPER_BOUND = 10;
    private static final String INVALID_CATEGORY_MESSAGE = "존재하지 않는 카테고리입니다.";

    private final Integer command;
    private final String name;

    Category(Integer command, String name) {
        this.command = command;
        this.name = name;
    }

    public static Category of(Integer number) {
        return Arrays.stream(Category.values())
                .filter(category -> category.command == number)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(INVALID_CATEGORY_MESSAGE));
    }

    public static List <Category> generateRandomCategory(int size) {
        size = Integer.min(size, CATEGORY_SIZE_UPPER_BOUND);
        List <Category> categories = new ArrayList <>();
        for (int i = 0; i < size; i++) {
            Category category = getValidCategory(categories);
            categories.add(category);
        }
        return categories;
    }

    private static Category getValidCategory(List <Category> categories) {
        Category category = Category.of(pickNumberInRange(CATEGORY_INDEX_LOWER_BOUND, CATEGORY_INDEX_UPPER_BOUND));
        if (getCount(categories, category) >= INVALID_CATEGORY_SIZE) {
            return getValidCategory(categories);
        }
        return category;
    }

    private static long getCount(List <Category> categories, Category other) {
        return categories.stream()
                .filter(category -> category.equals(other))
                .count();
    }

    public String getName() {
        return name;
    }
}
