public class Author {
   private String firstName;
   private String lastName;

    public Author(String FirstName, String LastName) {
        this.firstName = FirstName;
        this.lastName = LastName;
    }

    public String getFirstName() {
        return firstName + " " + lastName;
    }

    public String getLastName() {
        return lastName;
    }

}
