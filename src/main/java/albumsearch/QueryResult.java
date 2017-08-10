import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
class QueryResult{

    @JsonProperty("results")
    Results results;

    public QueryResult(){}

    public Results getResults(){
        return results;
    }
    public void setResults(Results results){
        this.results = results;
    }

    @Override
    public String toString(){
        return results.toString();
    }
}

