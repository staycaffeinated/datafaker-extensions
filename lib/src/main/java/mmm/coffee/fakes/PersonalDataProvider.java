package mmm.coffee.fakes;

import static mmm.coffee.fakes.Constants.DATA_FOLDER;

import java.nio.file.Paths;
import java.util.Locale;
import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

public class PersonalDataProvider extends AbstractProvider<BaseProviders> {

    private static final String[] EMAIL_PATTERNS = {
        "%s%s@%s", // johndoe@example.com
        "%s_%s@%s", // john_doe@example.com
        "%s.%s@%s", // john.doe@example.com
        "%1s.%s@%s" // j.doe@example.com
    };

    public PersonalDataProvider(BaseProviders faker) {
        super(faker);
        faker.addPath(Locale.ENGLISH, Paths.get(DATA_FOLDER + "/first-names.yml"));
        faker.addPath(Locale.ENGLISH, Paths.get(DATA_FOLDER + "/last-names.yml"));
        faker.addPath(Locale.ENGLISH, Paths.get(DATA_FOLDER + "/domain-names.yml"));
    }

    public String firstName() {
        return resolve("payload.firstNames");
    }

    public String lastName() {
        return resolve("payload.lastNames");
    }

    public String emailAddress(final String firstName, final String lastName) {
        String pattern = EMAIL_PATTERNS[faker.random().nextInt(EMAIL_PATTERNS.length)];
        String saneFirstName = firstName;
        if (pattern.startsWith("%1s")) saneFirstName = firstName.substring(0, 1);
        String saneLastName = lastName.replace(" ", "_");

        return String.format(Locale.ENGLISH, pattern, saneFirstName, saneLastName, domainName())
                .toLowerCase();
    }

    private String domainName() {
        return resolve("payload.domainName");
    }
}
