package info.movito.themoviedbapi.model.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Language extends info.movito.themoviedbapi.model.Language {

    @JsonProperty("english_name")
    private String englishName;

    public String getEnglishName() { return englishName; }

    public void setEnglishName(String englishName) { this.englishName = englishName; }
}
