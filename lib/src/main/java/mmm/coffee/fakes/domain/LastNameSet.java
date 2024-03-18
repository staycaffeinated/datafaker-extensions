package mmm.coffee.fakes.domain;

import lombok.Data;

import java.util.Set;
import java.util.TreeSet;

/**
 * LastNames
 */
@Data
public class LastNameSet {
    private Set<String> lastNames = new TreeSet<>();
}
