package mmm.coffee.fakes.domain;

import lombok.Data;

import java.util.Set;
import java.util.TreeSet;

/**
 * FirstNames in Set format.
 * <p>
 * Using Set vs List affects how the data is rendered in Yaml.
 * Lists are rendered:
 * <code>
 *     listName:
 *     - item1
 *     - item2
 *     - item3
 * </code>
 * </p><p>
 * while Sets are rendered:
 * <code>
 *  listName: [ item1, item2, item3 ]
 * </code>
 * </p>
 */
@Data
public class FirstNameSet {
    private Set<String> firstNames = new TreeSet<>();
}
