package mmm.coffee.fakes;

import net.datafaker.Faker;
import net.datafaker.providers.base.BaseFaker;

/**
 * Provider of insect names
 */
public class FirstNameFaker extends Faker {

    public FirstNameProvider firstNames() {
        return BaseFaker.getProvider(FirstNameProvider.class, FirstNameProvider::new, this);
    }
}
