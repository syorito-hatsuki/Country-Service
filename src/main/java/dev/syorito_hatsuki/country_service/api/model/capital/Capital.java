package dev.syorito_hatsuki.country_service.api.model.capital;

public class Capital {
    private final String error;
    private final String msg;
    private final CapitalData data;

    public Capital(String error, String msg, CapitalData data) {
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

    public CapitalData getData() {
        return data;
    }
}
