import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;

@JsonIgnoreProperties(ignoreUnknown = true)
class TrackMatches{


    //@JsonProperty("track")
    //List<Track> track;
    //Object track;

    @JsonProperty("track")
    List<Track> track;

    public List<Track> getTrack() {
        return this.track;
    }

    public void setTrack(List<Track> track) {
        this.track = track;
    }

   
    @Override
    public String toString(){
        
        String res = "";
        
        for(Track t : track){
            res = res + "\n---->" + t.toString();
        }
        return res;
    }


}
