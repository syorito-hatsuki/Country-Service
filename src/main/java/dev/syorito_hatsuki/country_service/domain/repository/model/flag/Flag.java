package dev.syorito_hatsuki.country_service.domain.repository.model.flag;

public class Flag {
    private final String error;
    private final String msg;
    private final FlagData data;

    public Flag() {
        error = "none";
        msg = "none";
        data = new FlagData();
    }

    public String getError() {
        return error;
    }

    public String getMsg() {
        return msg;
    }

    public FlagData getData() {
        return data;
    }
}
