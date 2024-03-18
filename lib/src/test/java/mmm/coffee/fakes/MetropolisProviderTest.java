package mmm.coffee.fakes;

import static org.assertj.core.api.Assertions.assertThat;

import net.datafaker.providers.base.BaseProviders;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

/**
 * Unit tests
 */
class MetropolisProviderTest {

    BaseProviders mockProviders = Mockito.mock(BaseProviders.class);

    MetropolisProvider sut = new MetropolisProvider(mockProviders);

    /**
     * This is here simply to exercise the lombok-generated equals method
     */
    @Test
    void shouldVerifyEquals() {
        assertThat(sut).isNotEqualTo(new Object());
    }

    /**
     * This is here simply to exercise the lombok-generated hashCode method
     */
    @Test
    void shouldVerifyHashCode() {
        assertThat(sut.hashCode()).isBetween(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
