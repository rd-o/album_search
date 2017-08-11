import java.util.*;
import org.springframework.web.client.RestTemplate;
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class AlbumSearch {


    public static void main(String args[]) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        Config config = null;

        try {
            config = mapper.readValue(new File("./src/main/resources/api.properties"), Config.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        if(args.length > 0 && config != null){
            String track = args[0];
            RestTemplate restTemplate = new RestTemplate();
            String URI = config.getUri() + config.getTrack().get("search");


            System.out.println("Search track: " + track);
        
            QueryResult qres = restTemplate.getForObject(URI, QueryResult.class, track, config.getKey());
            System.out.println(qres.toString());
        }
    }
}
