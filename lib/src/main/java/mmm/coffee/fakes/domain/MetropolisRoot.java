package mmm.coffee.fakes.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import mmm.coffee.fakes.annotations.ExcludeFromJacocoCodeCoverageReport;

/**
 * Container of Metropolis data
 */
@Data
@NoArgsConstructor
@ExcludeFromJacocoCodeCoverageReport
public class MetropolisRoot {
    @JsonProperty("metropolis")
    private List<Metropolis> metropolisList = new ArrayList<>();
}
