package gierka;

import java.util.Scanner;

public class UserNameCreator {

    public UserName aUserName(Scanner scanner) {
        UserName userName = null;
        while (userName == null) {
            System.out.print("Podaj swój nick: ");
            String userNameCandidate = scanner.nextLine();
            try {
                userName = new UserName(userNameCandidate);
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(illegalArgumentException.getMessage());
            }
        }
        return userName;
    }
}
