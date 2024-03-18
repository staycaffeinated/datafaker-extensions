package mmm.coffee.fakes;

import net.datafaker.Faker;
import net.datafaker.providers.base.BaseFaker;

/**
 * Provider of domain names
 */
public class MetropolisFaker extends Faker {

    public MetropolisProvider metropolis() {
        return BaseFaker.getProvider(MetropolisProvider.class, MetropolisProvider::new, this);
    }
}
