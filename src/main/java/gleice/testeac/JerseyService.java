
package gleice.testeac;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author gleiceellen
 */
@Path("/message")
public class JerseyService {

    @GET
    public String getMsg()
    {
         return "Hello World !! - Jersey 2";
    }
}
