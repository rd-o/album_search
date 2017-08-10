import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
class Results{


    @JsonProperty("opensearch")
    String opensearch;

    @JsonProperty("trackmatches")
    //Object trackmatches;
    TrackMatches trackmatches;

    public Results(){}

    public String getOpensearch(){
        return opensearch;
    }
    public void setOpensearch(String opensearch){
        this.opensearch = opensearch;
    }

    //public Object getTrackmatches(){
    public TrackMatches getTrackmatches(){
        return trackmatches;
    }

    //public void setTrackmatches(Object trackmatches){
    public void setTrackmatches(TrackMatches trackmatches){
        this.trackmatches = trackmatches;
    }

    @Override
    public String toString(){
        return "\n\n\n trackmatches -------->\n" + trackmatches.toString();
    }
}
