import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;

@JsonIgnoreProperties(ignoreUnknown = true)
class Track{

    @JsonProperty("name")
    String name;

    @JsonProperty("artist")
    String artist;

    @JsonProperty("url")
    String url;

    @JsonProperty("streamable")
    String streamable;

    @JsonProperty("listeners")
    String listeners;
    
    //List image;
    @JsonProperty("image")
    Object image;
    //List<Object> image;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getArtist(){
        return artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url = url;
    }

    //public List<Object> getImage(){
    public Object getImage(){
        return image;
    }
    //public void setImage(List<Object> image){
    public void setImage(Object image){
        this.image = image;
    }

    public String getListeners(){
        return listeners;
    }
    public void setListeners(String listeners){
        this.listeners = listeners;
    }

    @Override
    public String toString(){
        return "Name: " + name + " - Artist: " + artist + " - Listeners: " + listeners + "\n";
    }
}
