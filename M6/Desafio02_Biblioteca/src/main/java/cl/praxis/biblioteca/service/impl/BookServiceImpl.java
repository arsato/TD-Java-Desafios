package cl.praxis.biblioteca.service.impl;

import cl.praxis.biblioteca.entity.Book;
import cl.praxis.biblioteca.repository.IBookRepository;
import cl.praxis.biblioteca.service.ICRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements ICRUDService<Book> {

    @Autowired
    private IBookRepository books;

    @Override
    public Book getById(int id) {
        return books.findById(id).orElse(null);
    }

    @Override
    public List<Book> getAll() {
        return books.findAll();
    }

    @Override
    public Book create(Book book) {
        return books.save(book);
    }

    @Override
    public Book update(Book book) {
        if(books.existsById(book.getId())) {
            return books.save(book);
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        if(books.existsById(id)) {
            books.deleteById(id);
            return true;
        }
        return false;
    }
}
