package my.app


class Person {
    String id
    String firstName
    String lastName
    Map<String,Address> addresses = [:]
    static embedded = ['addresses']

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addresses=" + addresses +
                '}';
    }

    static constraints = {
    }
}
