package menu.dto;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class CoachNamesDto {

    List<String> names;

    public CoachNamesDto(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }
}
