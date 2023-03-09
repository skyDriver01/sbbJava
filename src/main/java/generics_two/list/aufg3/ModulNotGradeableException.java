package generics_two.list.aufg3;

public class ModulNotGradeableException extends Exception {
    public ModulNotGradeableException() {
        super();
    }

    public ModulNotGradeableException(String message) {
        super(message);
    }

    public ModulNotGradeableException(String message, Throwable cause) {
        super(message, cause);
    }

    public ModulNotGradeableException(Throwable cause) {
        super(cause);
    }

    protected ModulNotGradeableException(String message, Throwable cause, boolean enableSuppression,
                                         boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}