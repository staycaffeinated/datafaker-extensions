package mmm.coffee.fakes;

import net.datafaker.Faker;
import net.datafaker.providers.base.BaseFaker;

/**
 * Provider of domain names
 */
public class EmailAddressFaker extends Faker {

    public EmailAddressProvider emailAddresses() {
        return BaseFaker.getProvider(EmailAddressProvider.class, EmailAddressProvider::new, this);
    }
}
