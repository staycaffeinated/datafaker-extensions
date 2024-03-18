package mmm.coffee.fakes.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import mmm.coffee.fakes.annotations.ExcludeFromJacocoCodeCoverageReport;

@Data
@NoArgsConstructor
@ExcludeFromJacocoCodeCoverageReport
public class Metropolis {
    private String city;
    private String stateId;
    private String postalCode;
    private String population;
    private String timeZone;
    private String county;
}
