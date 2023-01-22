package gierka;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserNameCreator userNameCreator = new UserNameCreator();
        UserName userName = userNameCreator.aUserName(scanner);
        System.out.println("Twoja nazwa użytkownika: " + userName.userName());
    }
}
