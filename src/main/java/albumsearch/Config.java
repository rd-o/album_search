import java.util.Map;

public class Config {

    private String key;
    private String uri;
    private Map<String, String> track;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUri() {
        return this.uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Map<String, String> getTrack() {
        return this.track;
    }

    public void setTrack(Map<String, String> track) {
        this.track = track;
    }
}
