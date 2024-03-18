package mmm.coffee.fakes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit tests
 */
class EmailAddressFakerTest {

    EmailAddressFaker sut = new EmailAddressFaker();

    @Test
    void shouldReturnEmailAddresses() {
        String fname = "joe";
        String lname = "doe";

        /*
         * There's some randomness to domain names and email formats.
         * To ensure the 'randomness' is covered, this loop is used to
         * exercise the code multiple times.
         */
        for (int i = 0; i < 20; i++) {
            assertThat(sut.emailAddresses().emailAddress(fname, lname))
                    .isNotNull()
                    .isNotBlank()
                    .contains("@");
        }
    }
}
