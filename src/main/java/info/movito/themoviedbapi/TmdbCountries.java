package info.movito.themoviedbapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import info.movito.themoviedbapi.model.config.Country;
import info.movito.themoviedbapi.model.core.AbstractJsonMapping;
import info.movito.themoviedbapi.tools.ApiUrl;

import java.util.List;

public class TmdbCountries extends AbstractTmdbApi{

    public static final String TMDB_METHOD_COUNTRIES = "configuration/countries";

    TmdbCountries(TmdbApi tmdbApi) { super(tmdbApi); }

    public List<Country> getCountries() {
        ApiUrl apiUrl = new ApiUrl(TMDB_METHOD_COUNTRIES);

        return mapJsonResult(apiUrl, CountryResults.class).countries;
    }


    private static class CountryResults extends AbstractJsonMapping {

        @JsonProperty("countries")
        private List<Country> countries;
    }
}
