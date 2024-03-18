package mmm.coffee.fakes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test
 */
class DomainNameFakerTest {

    DomainNameFaker sut = new DomainNameFaker();

    @Test
    void shouldReturnFirstName() {
        assertThat(sut.domainNames().nextName()).isNotNull();

        for (int i = 0; i < 10; i++) {
            System.out.println(sut.domainNames().nextName());
        }
    }

}
