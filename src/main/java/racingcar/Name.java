package racingcar;

public class Name {

    String name;
    public static final int MIN_NAME_LENGTH = 1;
    public static final int MAX_NAME_LENGTH = 5;

    public Name(String name) {
        if (!validationName(name)) {
            throw new IllegalArgumentException("[ERROR]");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private boolean validationName(String name) {
        return (MIN_NAME_LENGTH <= name.length() && name.length() <= MAX_NAME_LENGTH);
    }
}
