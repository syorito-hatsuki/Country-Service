package dev.syorito_hatsuki.country_service.domain.repository.model.countries;

import java.util.List;

public class Countries {
    public Boolean error;
    public String msg;
    public List<CountryData> data;

    public Countries() {
        error = true;
        msg = "none";
        data = List.of();
    }

    public Boolean getError() {
        return error;
    }

    public String getMsg() {
        return msg;
    }

    public List<CountryData> getData() {
        return data;
    }

}
