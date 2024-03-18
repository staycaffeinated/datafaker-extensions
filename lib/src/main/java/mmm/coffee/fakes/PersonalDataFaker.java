package mmm.coffee.fakes;

import net.datafaker.Faker;
import net.datafaker.providers.base.BaseFaker;

/**
 * Provider of domain names
 */
public class PersonalDataFaker extends Faker {

    public PersonalDataProvider personNames() {
        return BaseFaker.getProvider(PersonalDataProvider.class, PersonalDataProvider::new, this);
    }
}
