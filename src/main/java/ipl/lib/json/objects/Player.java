package ipl.lib.json.objects;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

    @Data
    public class Player {

        @JsonProperty("name")
        private String name;
        @JsonProperty("country")
        private String country;
        @JsonProperty("role")
        private String role;
        @JsonProperty("price-in-crores")
        private String priceInCrores;


    }
