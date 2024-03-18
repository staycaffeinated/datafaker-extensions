package mmm.coffee.fakes;

import net.datafaker.Faker;
import net.datafaker.providers.base.BaseFaker;

/**
 * Provider of insect names
 */
public class LastNameFaker extends Faker {

    public LastNameProvider lastNames() {
        return BaseFaker.getProvider(LastNameProvider.class, LastNameProvider::new, this);
    }
}
