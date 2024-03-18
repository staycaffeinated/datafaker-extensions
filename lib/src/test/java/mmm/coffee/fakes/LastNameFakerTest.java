package mmm.coffee.fakes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit test
 */
class LastNameFakerTest {

    LastNameFaker sut = new LastNameFaker();

    @Test
    void shouldReturnLastName() {
        assertThat(sut.lastNames().nextName()).isNotNull();
    }
}
