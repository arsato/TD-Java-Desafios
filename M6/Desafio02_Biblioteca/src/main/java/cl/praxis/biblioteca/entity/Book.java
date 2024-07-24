package cl.praxis.biblioteca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
@NamedQuery(name = "Book.findByAuthor", query = "select b from Book b where b.author = ?1")
@NamedQuery(name = "Book.findByTitle", query = "select b from Book b where b.title = ?1")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 100)
    private String author;

    @Column(nullable = false, length = 100)
    private String editorial;

    @Column(nullable = false)
    private int edition;

    @Column(nullable = false, length = 100)
    private String year;
}
