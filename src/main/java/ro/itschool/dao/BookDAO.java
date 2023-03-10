package ro.itschool.dao;

//DAO = Data Access Object

import ro.itschool.entity.Book;

import java.util.List;
import java.util.Optional;

//Obiectul care face legatura intre Java si DB
//Aici vor fi toate metodele prin care vom interactiona cu DB-ul
public interface BookDAO {

    void insertBook(Book book);

    void insertMultipleBooks(List<Book> book);

    List<Book> getAllBooks();

    Optional<Book> getBookById(Integer id);

    void deleteBookById(Integer id);

    void updateBook(Book bookFromFrontend);

    Book getBookByIdWithCriteriaBuilder(Integer id);

}
