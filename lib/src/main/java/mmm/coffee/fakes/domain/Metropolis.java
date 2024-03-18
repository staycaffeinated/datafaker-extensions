package mmm.coffee.fakes.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Metropolis {
    private String city;
    private String stateId;
    private String postalCode;
    private String population;
    private String timeZone;
    private String county;
}
