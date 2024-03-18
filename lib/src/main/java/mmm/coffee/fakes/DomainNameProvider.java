package mmm.coffee.fakes;

import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

import java.nio.file.Paths;
import java.util.Locale;

import static mmm.coffee.fakes.Constants.DATA_FOLDER;


class DomainNameProvider extends AbstractProvider<BaseProviders> {

    public DomainNameProvider(BaseProviders faker) {
        super(faker);
        faker.addPath(Locale.ENGLISH, Paths.get(DATA_FOLDER + "/domain-names.yml"));

        var foo = faker.getFaker();
    }

    public String nextName() {
        return resolve("payload.domainName");
    }
}
