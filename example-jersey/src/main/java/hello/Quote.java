package hello;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quote {

    @JsonProperty("quote")
    public String quote;

    public Quote() {

    }

    public String getQuote() {
        return quote;
    }
}
