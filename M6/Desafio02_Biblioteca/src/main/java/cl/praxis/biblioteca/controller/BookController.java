package cl.praxis.biblioteca.controller;

import cl.praxis.biblioteca.entity.Book;
import cl.praxis.biblioteca.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public String getAll(Model model) {
        List<Book> books = bookService.getAll();
        model.addAttribute("libros", books);
        return "books";
    }

//    @GetMapping("/{id}")
//    public String getById(Model model, @PathVariable int id) {
//        List<Book> books = new ArrayList<>();
//        Book book = bookService.getById(id);
//        books.add(book);
//        model.addAttribute("libros", books);
//        return "books";
//    }

    @GetMapping("/search")
    public String searchBooksByAuthor(@RequestParam(value = "author", required = false) String author, Model model) {
        List<Book> books = bookService.getByAuthor(author);
        model.addAttribute("libros", books);
        return "books";
    }


}
