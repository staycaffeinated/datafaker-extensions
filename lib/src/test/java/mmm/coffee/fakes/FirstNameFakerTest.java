package mmm.coffee.fakes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit test
 */
class FirstNameFakerTest {

    FirstNameFaker sut = new FirstNameFaker();

    @Test
    void shouldReturnFirstName() {
        assertThat(sut.firstNames().nextName()).isNotNull();
    }
}
