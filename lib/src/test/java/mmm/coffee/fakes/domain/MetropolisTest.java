package mmm.coffee.fakes.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit test
 */
class MetropolisTest {

    @Test
    void verifyMetropolis() {
        Metropolis metropolis = new Metropolis();
        assertThat(metropolis.getCity()).isNull();
    }
}
