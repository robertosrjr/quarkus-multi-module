import org.jboss.logging.Logger;
import port.in.GreetingService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    private static final Logger  LOG = Logger.getLogger(GreetingResource.class);
    @Inject
    private GreetingService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        LOG.info("GreetingResource::hello");
        return this.service.getName();
    }
}