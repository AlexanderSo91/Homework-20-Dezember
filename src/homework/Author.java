package homework;

import java.util.Objects;

public class Author {

    private String firstName;
    private String lastNAme;

    public Author(String firstName, String lastNAme) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastNAme='" + lastNAme + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastNAme, author.lastNAme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastNAme);
    }
}