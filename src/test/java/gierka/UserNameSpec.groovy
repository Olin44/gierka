package gierka

import gierka.UserName
import spock.lang.Specification

class UserNameSpec extends Specification {

    def "create user name"() {
        given:
        String userNameCandidate = "Userek"
        when:
        UserName userName = new UserName(userNameCandidate)
        then:
        userName.userName() == userNameCandidate
    }

    def "create invalid user name"() {
        given:
        when:
        new UserName(userNameCandidate)
        then:
        def ex = thrown(IllegalArgumentException)
        ex.message == exceptionMessage
        where:
        userNameCandidate      || exceptionMessage
        "user"                 || "Nazwa użytkownika nie może być krótsza niż 5 znaków!"
        "useruseruseruseruser" || "Nazwa użytkownika nie może być dłuższa niż 12 znaków!"
    }
}