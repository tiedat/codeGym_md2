package arrayAndMethod.IllegalTriangleException;

class IllegalTriangleException extends Exception {
    IllegalTriangleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Error input length of Triangle sides \n" + super.getMessage();
    }

}
