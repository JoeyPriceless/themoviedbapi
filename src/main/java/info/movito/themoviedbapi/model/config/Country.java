package info.movito.themoviedbapi.model.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import info.movito.themoviedbapi.model.core.AbstractJsonMapping;


public class Country extends AbstractJsonMapping {

    @JsonProperty("iso_3166_1")
    private String isoCode;
    @JsonProperty("english_name")
    private String name;


    public String getIsoCode() {
        return isoCode;
    }


    public String getName() {
        return name;
    }

    public void setIsoCode(String isoCode) { this.isoCode = isoCode; }

    public void setName(String name) { this.name = name; }
}
