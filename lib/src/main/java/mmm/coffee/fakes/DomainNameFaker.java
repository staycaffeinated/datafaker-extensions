package mmm.coffee.fakes;

import net.datafaker.Faker;
import net.datafaker.providers.base.BaseFaker;

/**
 * Provider of domain names
 */
public class DomainNameFaker extends Faker {

    public DomainNameProvider domainNames() {
        return BaseFaker.getProvider(DomainNameProvider.class, DomainNameProvider::new, this);
    }
}
