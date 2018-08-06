package marmel.diploma.srpingapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String fristName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Author(String fristName, String lastName) {
        this.fristName = fristName;
        this.lastName = lastName;
    }

    public Author(String fristName, String lastName, Set<Book> books) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.books = books;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return Id == author.Id;
    }

    @Override
    public int hashCode() {
        return (int) (Id ^ (Id >>> 32));
    }

    @Override
    public String toString() {
        return "Author{" +
                "Id=" + Id +
                ", fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
                '}';
    }
}
