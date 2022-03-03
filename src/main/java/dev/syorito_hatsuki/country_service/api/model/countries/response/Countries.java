package dev.syorito_hatsuki.country_service.api.model.countries.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

public class Countries {

    @JsonIgnoreProperties(value = "error")
    public Boolean error;
    @JsonIgnoreProperties(value = "msg")
    public String msg;
    @JsonIgnoreProperties(value = "data")
    public List<CountryData> data;

    @JsonCreator
    public Countries(Boolean error, String msg, List<CountryData> data) {
        this.error = error;
        this.msg = msg;
        this.data = data;
    }

    public List<CountryData> getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public Boolean getError() {
        return error;
    }
}
