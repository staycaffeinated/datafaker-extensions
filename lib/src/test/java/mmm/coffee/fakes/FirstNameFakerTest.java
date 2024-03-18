package mmm.coffee.fakes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test
 */
class FirstNameFakerTest {

    FirstNameFaker sut = new FirstNameFaker();

    @Test
    void shouldReturnFirstName() {
        assertThat(sut.firstNames().nextName()).isNotNull();

        for (int i = 0; i < 10; i++) {
            System.out.println(sut.firstNames().nextName());
        }
    }

}
