package hello;

import javax.ws.rs.core.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;


@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        String responseString = "ERROR";
        String location = "";
        try {

        Client client = ClientBuilder.newClient();

        WebTarget target2 = client.target("https://api.kanye.rest");
        Quote response2 = target2.request(MediaType.APPLICATION_JSON_TYPE).get(Quote.class);

            responseString = response2.getQuote();

        WebTarget target = client.target("https://aws.random.cat/meow");
            CatPic response1 = target.request(MediaType.APPLICATION_JSON_TYPE).get(CatPic.class);
            location = response1.getLocation();
        } catch (Throwable t) {
            return t.getMessage();
        }

        return "<h1>"+responseString+"</h1><img src=\""+location+"\"/>";
    }
    
}
