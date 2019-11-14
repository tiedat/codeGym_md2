package arrayAndMethod.IllegalTriangleException;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error input length of Triangle sides \n" + super.getMessage();
    }

}
