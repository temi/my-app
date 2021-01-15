package my.app


class Address {
    String id
    String addressLine
    String addressLine2
    String street

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressLine='" + addressLine + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
    static constraints = {
    }
}
