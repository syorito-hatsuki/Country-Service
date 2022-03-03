package dev.syorito_hatsuki.country_service.dto.flag.response;

public class Flag {
    private final String error;
    private final String msg;
    private final FlagData data;

    public Flag(String error, String msg, FlagData data) {
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

    public FlagData getData() {
        return data;
    }
}
