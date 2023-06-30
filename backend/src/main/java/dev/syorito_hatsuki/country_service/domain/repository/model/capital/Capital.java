package dev.syorito_hatsuki.country_service.domain.repository.model.capital;

public class Capital {
    private final String error;
    private final String msg;
    private final CapitalData data;

    public Capital() {
        this.error = "none";
        this.msg = "none";
        this.data = new CapitalData();
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
