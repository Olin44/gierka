package gierka

import spock.lang.Specification

class UserNameCreatorSpec extends Specification {
    def "create user name"() {
        given:
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream("dupa\ndupek".getBytes());
        System.setIn(byteArrayInputStream);
        Scanner scanner = new Scanner(System.in)
        UserNameCreator userNameCreator = new UserNameCreator()
        when:
        UserName userName = userNameCreator.aUserName(scanner)
        then:
        userName.userName() == "dupek"
    }
}
