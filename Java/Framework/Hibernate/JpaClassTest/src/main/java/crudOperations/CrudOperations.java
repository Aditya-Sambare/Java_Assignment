package crudOperations;

import Entities.Book;
import Entities.Library;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrudOperations {
    Scanner sc = new Scanner(System.in);
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aditya");

public void insertbook(){
    System.out.println("..........................................................................................");

    EntityManager entityManager = entityManagerFactory.createEntityManager();
    System.out.println("enter library id in which you want to insert book");
    int libraryId = Integer.parseInt(sc.nextLine());
    System.out.println("enter book name");
    String name = sc.nextLine();
    System.out.println("Enter book price");
    int price = Integer.parseInt(sc.nextLine());
    Book book = new Book();
    Library library = entityManager.find(Library.class,libraryId);
    book.setBookName(name);
    book.setPrice(price);
    book.setLibrary(library);
    List<Book> books = new ArrayList<>();
    books.add(book);
    library.setBooks(books);
    entityManager.getTransaction().begin();
    entityManager.persist(library);
    entityManager.getTransaction().commit();
    entityManager.close();
    System.out.println("..........................................................................................");

}
public void insertLibrary(){
    System.out.println("..........................................................................................");

    EntityManager entityManager = entityManagerFactory.createEntityManager();
    System.out.println("Enter library name");
    String libName = sc.nextLine();
    Library library = new Library();
    List<Book> bookList = new ArrayList<>();
    library.setLibName(libName);
    library.setBooks(bookList);
    entityManager.getTransaction().begin();
    entityManager.persist(library);
    entityManager.getTransaction().commit();
    entityManager.close();
    System.out.println("..........................................................................................");

}
public void updatebook(){
    System.out.println("..........................................................................................");

    EntityManager entityManager = entityManagerFactory.createEntityManager();
Book book = new Book();
    System.out.println("enter updated price");
    int price = Integer.parseInt(sc.nextLine());
    System.out.println("enter book id");
    int id = Integer.parseInt(sc.nextLine());
    entityManager.getTransaction().begin();
book = entityManager.find(Book.class,id);
book.setPrice(price);
    entityManager.getTransaction().commit();
    entityManager.close();
    System.out.println("..........................................................................................");

}
public void fetchbook(){
    System.out.println("..........................................................................................");

    EntityManager entityManager = entityManagerFactory.createEntityManager();
    Book book = new Book();
    System.out.println("enter book id you want to fetch");
    int id = Integer.parseInt(sc.nextLine());
    entityManager.getTransaction().begin();
    book = entityManager.find(Book.class,id);
    System.out.println("..........................................................................................");
    System.out.println(book.getBookId());
    System.out.println(book.getBookName());
    System.out.println(book.getPrice());
    System.out.println("..........................................................................................");

}
public void deletebook(){
    System.out.println("..........................................................................................");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    Library library = new Library();
    System.out.println("enter library id from which you want to delete the book");
    int libraryId = Integer.parseInt(sc.nextLine());
    System.out.println("enter book id you want to delete");
    int bookId = Integer.parseInt(sc.nextLine());
    entityManager.getTransaction().begin();
    library = entityManager.find(Library.class,libraryId);
    Book book = new Book();
    book = entityManager.find(Book.class,bookId);
    library.getBooks().remove(book);
    entityManager.remove(book);
    entityManager.getTransaction().commit();
    entityManager.close();
    System.out.println("..........................................................................................");

}
}
