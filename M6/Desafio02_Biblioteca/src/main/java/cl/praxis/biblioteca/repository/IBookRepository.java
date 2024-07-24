package cl.praxis.biblioteca.repository;

import cl.praxis.biblioteca.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {
}
