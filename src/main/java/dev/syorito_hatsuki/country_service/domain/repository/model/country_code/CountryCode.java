package dev.syorito_hatsuki.country_service.domain.repository.model.country_code;

public class CountryCode {
    private final String error;
    private final String msg;
    private final CountryCodeData data;

    public CountryCode() {
        this.error = "none";
        this.msg = "none";
        this.data = new CountryCodeData();
    }

    public CountryCode(String error, String msg, CountryCodeData data) {
        this.error = error;
        this.msg = msg;
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public String getMsg() {
        return msg;
    }

    public CountryCodeData getData() {
        return data;
    }
}
