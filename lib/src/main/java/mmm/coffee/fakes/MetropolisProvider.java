package mmm.coffee.fakes;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import mmm.coffee.fakes.domain.Metropolis;
import mmm.coffee.fakes.domain.MetropolisRoot;
import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static mmm.coffee.fakes.Constants.DATA_FOLDER;

@EqualsAndHashCode(callSuper = true)
@Slf4j
class MetropolisProvider extends AbstractProvider<BaseProviders> {

    private static final String DATAFILE = DATA_FOLDER + "/metropolis.yml";
    private ObjectMapper objectMapper;
    private List<Metropolis> metropolisList = new ArrayList<>();

    public MetropolisProvider(BaseProviders faker) {
        super(faker);
        // faker.addPath is not called since we the data ourselves.

        loadMetropolisData();
    }

    public Metropolis next() {
        int index = faker.random().nextInt(0, metropolisList.size());
        return metropolisList.get(index);
    }

    private void loadMetropolisData() {

        try {
            File file = Paths.get(DATAFILE).toFile();
            objectMapper = new ObjectMapper(new YAMLFactory());
            objectMapper.findAndRegisterModules();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            MetropolisRoot root = objectMapper.readValue(file, MetropolisRoot.class);
            metropolisList.addAll(root.getMetropolisList());
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }
}
