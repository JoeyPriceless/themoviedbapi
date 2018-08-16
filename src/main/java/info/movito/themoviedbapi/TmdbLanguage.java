package info.movito.themoviedbapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import info.movito.themoviedbapi.AbstractTmdbApi;
import info.movito.themoviedbapi.model.config.Language;
import info.movito.themoviedbapi.model.core.AbstractJsonMapping;
import info.movito.themoviedbapi.tools.ApiUrl;

import java.util.List;

public class TmdbLanguage extends AbstractTmdbApi {

    public static final String TMDB_METHOD_LANGUAGE = "configuration/languages";


    TmdbLanguage(TmdbApi tmdbApi) {
        super(tmdbApi);
    }


    public List<Language> getLanguages() {
        ApiUrl apiUrl = new ApiUrl(TMDB_METHOD_LANGUAGE);

        return mapJsonResult(apiUrl, LanguageResults.class).languages;
    }


    private static class LanguageResults extends AbstractJsonMapping {

        @JsonProperty("languages")
        private List<Language> languages;
    }
}
