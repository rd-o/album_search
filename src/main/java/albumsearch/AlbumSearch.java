import java.util.*;
import org.springframework.web.client.RestTemplate;



public class AlbumSearch {


    public static void main(String args[]) {
        String APIKey = "81268e3689a0f1cd9956190a6053f8cf";
        String URI = "http://ws.audioscrobbler.com/2.0/?method=track.search&track={track}&api_key={apikey}&format=json";

        if(args.length > 0){
            String track = args[0];
            RestTemplate restTemplate = new RestTemplate();


            System.out.println("Search track: " + track);
        
            QueryResult qres = restTemplate.getForObject(URI, QueryResult.class, track, APIKey);
            System.out.println(qres.toString());
        }
/*
        String res = restTemplate.getForObject(URI, String.class, track, APIKey);
        System.out.println(res);*/
    }

}
