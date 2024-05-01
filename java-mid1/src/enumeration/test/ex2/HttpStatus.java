package enumeration.test.ex2;

public enum HttpStatus {
    OK(200, "Ok"),
    BAD_REQUEST(400,"Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500," Internal Server Error");

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int code){
        HttpStatus[] values = values();
        for (HttpStatus value : values) {
            if (value.getCode() == code) {
                return value;
            }
        }
        return null;
    }

    public boolean isSuccess(){
        return code>=200 && code<=299;
    }
}
