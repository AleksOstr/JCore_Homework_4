package ShopExceptions;

public class AmountException extends Exception{
    private String message;

    public AmountException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
