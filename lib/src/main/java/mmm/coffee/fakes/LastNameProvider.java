package mmm.coffee.fakes;

import static mmm.coffee.fakes.Constants.DATA_FOLDER;

import java.nio.file.Paths;
import java.util.Locale;
import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

class LastNameProvider extends AbstractProvider<BaseProviders> {

    public LastNameProvider(BaseProviders faker) {
        super(faker);
        faker.addPath(Locale.ENGLISH, Paths.get(DATA_FOLDER + "/last-names.yml"));
    }

    public String nextName() {
        return resolve("payload.lastNames");
    }
}
