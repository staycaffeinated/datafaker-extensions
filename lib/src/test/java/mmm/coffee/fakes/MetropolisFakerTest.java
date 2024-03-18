package mmm.coffee.fakes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit test
 */
class MetropolisFakerTest {

    MetropolisFaker sut = new MetropolisFaker();

    @Test
    void shouldReturnMetropolis() {
        assertThat(sut.metropolis().next()).isNotNull();
    }
}
