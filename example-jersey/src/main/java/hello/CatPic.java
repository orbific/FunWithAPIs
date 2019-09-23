package hello;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CatPic {

    @JsonProperty("file")
    public String location;

    public CatPic() {

    }

    public String getLocation() {
        return location;
    }
}
