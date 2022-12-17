package menu.dto;

import java.util.List;

public class CoachDto {
    private final String name;
    private final List<String>  hateMenus;
    private final List <String> recommendMenuList;

    public CoachDto(String name, List <String> hateMenus, List <String> recommendMenuList) {
        this.name = name;
        this.hateMenus = hateMenus;
        this.recommendMenuList = recommendMenuList;
    }

    public String getName() {
        return name;
    }

    public List <String> getHateMenus() {
        return hateMenus;
    }

    public List <String> getRecommendMenuList() {
        return recommendMenuList;
    }
}
