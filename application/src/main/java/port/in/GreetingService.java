package port.in;

import org.jboss.logging.Logger;
import port.out.repository.GreetingPortOut;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class GreetingService {

    private static final Logger LOG = Logger.getLogger(GreetingService.class);

    @Inject
    private GreetingPortOut greetingPortOut;

    public String getName() {

        LOG.info("GreetingService::getName");
        return "::GreetingService::getName::".concat(this.greetingPortOut.getGreeting());
    }
}
