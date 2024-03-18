package mmm.coffee.fakes.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cities {
    @Builder.Default
    List<Metropolis> metropolis = new ArrayList<>();

}
