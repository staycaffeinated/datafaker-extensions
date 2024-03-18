package mmm.coffee.fakes.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit test
 */
class MetropolisRootTest {

    MetropolisRoot sut = new MetropolisRoot();

    @Test
    void verifyNewInstanceHasNoData() {
        assertThat(sut.getMetropolisList()).isEmpty();
    }
}
