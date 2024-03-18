package mmm.coffee.fakes;

import static mmm.coffee.fakes.Constants.DATA_FOLDER;

import java.nio.file.Paths;
import java.util.Locale;
import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

class DomainNameProvider extends AbstractProvider<BaseProviders> {

    public DomainNameProvider(BaseProviders faker) {
        super(faker);
        faker.addPath(Locale.ENGLISH, Paths.get(DATA_FOLDER + "/domain-names.yml"));
    }

    public String nextName() {
        return resolve("payload.domainName");
    }
}
