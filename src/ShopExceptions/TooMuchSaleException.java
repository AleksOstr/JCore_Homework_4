package ShopExceptions;

public class TooMuchSaleException extends Exception{
    private String message;

    public TooMuchSaleException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
