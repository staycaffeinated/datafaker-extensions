package mmm.coffee.fakes;

import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

import java.nio.file.Paths;
import java.util.Locale;

import static mmm.coffee.fakes.Constants.DATA_FOLDER;


class FirstNameProvider extends AbstractProvider<BaseProviders> {

    public FirstNameProvider(BaseProviders faker) {
        super(faker);
        faker.addPath(Locale.ENGLISH, Paths.get(DATA_FOLDER + "/first-names.yml"));

        var foo = faker.getFaker();
    }

    public String nextName() {
        return resolve("payload.firstNames");
    }
}
