package hr.foi.cicd;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.Map;

@Path("/api/resource")
public class ExampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> get() {
        return Map.of("message", "Resource is available");
    }
}