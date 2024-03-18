package mmm.coffee.fakes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test
 */
class PersonalDataFakerTest {

    PersonalDataFaker sut = new PersonalDataFaker();

    @Test
    void shouldReturnNameFields() {
        assertThat(sut.personNames().firstName()).isNotNull().isNotEmpty();
        assertThat(sut.personNames().lastName()).isNotNull().isNotEmpty();
    }

    @Test
    void shouldAcquireEmailAddress() {
        String fname = sut.personNames().firstName();
        String surname =  sut.personNames().lastName();
        String email = sut.personNames().emailAddress(fname,surname);

        assertThat(fname).isNotNull().isNotEmpty();
        assertThat(surname).isNotNull().isNotEmpty();
        assertThat(email).isNotNull().isNotEmpty();

    }

}
