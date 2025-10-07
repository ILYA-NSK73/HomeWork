import java.util.Objects;

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

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Author)) return false;
        Author other = (Author) obj;
        return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
