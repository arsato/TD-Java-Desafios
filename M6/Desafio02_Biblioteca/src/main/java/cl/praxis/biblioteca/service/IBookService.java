package cl.praxis.biblioteca.service;

import cl.praxis.biblioteca.entity.Book;

import java.util.List;

public interface IBookService {

    List<Book> getByAuthor(String author);
    List<Book> getByTitle(String title);
    Book getById(int id);
    List<Book> getAll();
    Book create(Book book);
    Book update(Book book);
    boolean delete(int id);
}
