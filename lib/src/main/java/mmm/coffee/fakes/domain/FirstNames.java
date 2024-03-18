package mmm.coffee.fakes.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * FirstNames, in List format
 */
@Data
public class FirstNames {
    private List<String> firstNames = new ArrayList<>();
}
