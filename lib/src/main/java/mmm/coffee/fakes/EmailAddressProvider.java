package mmm.coffee.fakes;

import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

import java.nio.file.Paths;
import java.util.Locale;

import static mmm.coffee.fakes.Constants.DATA_FOLDER;


class EmailAddressProvider extends AbstractProvider<BaseProviders> {

    private static final String[] PATTERNS = {
            "%s%s@%s",
            "%s_%s@%s",
            "%s.%s@%s",
    };

    public EmailAddressProvider(BaseProviders faker) {
        super(faker);
        faker.addPath(Locale.ENGLISH, Paths.get(DATA_FOLDER + "/domain-names.yml"));

        var foo = faker.getFaker();
    }

    public String emailAddress(String firstName, String lastName) {
        String pattern = PATTERNS[faker.random().nextInt(PATTERNS.length)];
        return String.format(Locale.ENGLISH, pattern, firstName, lastName, domainName());
    }

    private String domainName() {
        return resolve("payload.domainName");
    }
}
