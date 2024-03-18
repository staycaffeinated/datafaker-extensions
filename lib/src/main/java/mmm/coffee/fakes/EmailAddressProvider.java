package mmm.coffee.fakes;

import static mmm.coffee.fakes.Constants.DATA_FOLDER;

import java.nio.file.Paths;
import java.util.Locale;
import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

class EmailAddressProvider extends AbstractProvider<BaseProviders> {

    private static final String[] PATTERNS = {
        "%s%s@%s", "%s_%s@%s", "%s.%s@%s",
    };

    public EmailAddressProvider(BaseProviders faker) {
        super(faker);
        faker.addPath(Locale.ENGLISH, Paths.get(DATA_FOLDER + "/domain-names.yml"));
    }

    public String emailAddress(String firstName, String lastName) {
        String pattern = PATTERNS[faker.random().nextInt(PATTERNS.length)];
        return String.format(Locale.ENGLISH, pattern, firstName, lastName, domainName());
    }

    private String domainName() {
        return resolve("payload.domainName");
    }
}
