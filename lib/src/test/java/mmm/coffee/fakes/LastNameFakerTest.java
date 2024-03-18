package mmm.coffee.fakes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test
 */
class LastNameFakerTest {

    LastNameFaker sut = new LastNameFaker();

    @Test
    void shouldReturnLastName() {
        assertThat(sut.lastNames().nextName()).isNotNull();

        for (int i = 0; i < 10; i++) {
            System.out.println(sut.lastNames().nextName());
        }
    }

}
