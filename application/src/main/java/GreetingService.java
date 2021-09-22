import javax.enterprise.context.ApplicationScoped;
import java.util.List;

import org.jboss.logging.Logger;

@ApplicationScoped
public class GreetingService {

    private static final Logger  LOG = Logger.getLogger(GreetingService.class);

    public String getName() {
        LOG.info("HGreetingService::getName");
        return "::GreetingService::getName::";
    }
}
