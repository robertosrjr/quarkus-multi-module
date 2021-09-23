package out.repository;

import org.jboss.logging.Logger;
import port.out.repository.GreetingPortOut;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingMongoRepository implements GreetingPortOut {

    private static final Logger LOG = Logger.getLogger(GreetingMongoRepository.class);

    @Override
    public String getGreeting() {
        LOG.info("HGreetingService::getName");
        return "GreetingMongoRepository::getGreeting";
    }
    
}
