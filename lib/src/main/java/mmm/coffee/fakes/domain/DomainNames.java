package mmm.coffee.fakes.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Domain names, in List format
 */
@Data
public class DomainNames {
    private List<String> domainName = new ArrayList<>();
}
