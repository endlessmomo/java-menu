package menu.dto;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class CoachNamesDto {
    private static final String COACH_NAMES_DELIMITER = ",";

    private final String coachNames;

    public CoachNamesDto(String coachNames) {
        this.coachNames = coachNames;
    }

    public List <String> getCoachNames(){
        return Arrays.stream(coachNames.split(COACH_NAMES_DELIMITER))
                .collect(toList());
    }
}
