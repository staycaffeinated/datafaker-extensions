package mmm.coffee.fakes.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Container of Metropolis data
 */
@Data
@NoArgsConstructor
public class MetropolisRoot {
    @JsonProperty("metropolis")
    private List<Metropolis> metropolisList = new ArrayList<>();
}
