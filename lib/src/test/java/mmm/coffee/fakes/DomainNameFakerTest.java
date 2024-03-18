package mmm.coffee.fakes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit test
 */
class DomainNameFakerTest {

    DomainNameFaker sut = new DomainNameFaker();

    @Test
    void shouldReturnFirstName() {
        assertThat(sut.domainNames().nextName()).isNotNull();
    }
}
