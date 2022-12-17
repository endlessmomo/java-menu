package menu.model.dto;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class HateMenusDto {
    private static final String MENU_NAMES_DELIMITER = ",";

    private final String hateMenus;

    public HateMenusDto(String menus) {
        this.hateMenus = menus;
    }

    public List <String> getHateMenus() {
        return Arrays.stream(hateMenus.split(MENU_NAMES_DELIMITER))
                .collect(toList());
    }
}
