package mmm.coffee.fakes;

import mmm.coffee.fakes.domain.Metropolis;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test
 */
class MetropolisFakerTest {

    MetropolisFaker sut = new MetropolisFaker();

    @Test
    void shouldReturnMetropolis() {
        assertThat(sut.metropolis().next()).isNotNull();

        for (int i = 0; i < 10; i++) {
            Metropolis metro = sut.metropolis().next();
            System.out.println(metro);
        }
    }

}
