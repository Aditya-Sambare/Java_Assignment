package Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int libId;
    String libName;
    @OneToMany(cascade = CascadeType.ALL)
    List<Book> books;

    public Library() {
    }

    public int getLibId() {
        return libId;
    }

    public void setLibId(int libId) {
        this.libId = libId;
    }

    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libId=" + libId +
                ", libName='" + libName + '\'' +

                '}';
    }
}
