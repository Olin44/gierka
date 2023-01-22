package gierka;

import com.sun.jdi.request.InvalidRequestStateException;

public record UserName(String userName) {

    private static final int MIN_USER_NAME_LENGTH = 5;
    private static final int MAX_USER_NAME_LENGTH = 12;

    public UserName {
        if (userName.length() < MIN_USER_NAME_LENGTH) {
            throw new IllegalArgumentException("Nazwa użytkownika nie może być krótsza niż %s znaków!".formatted(MIN_USER_NAME_LENGTH));
        }
        if (userName.length() > MAX_USER_NAME_LENGTH) {
            throw new IllegalArgumentException("Nazwa użytkownika nie może być dłuższa niż %s znaków!".formatted(MAX_USER_NAME_LENGTH));
        }
    }
}
