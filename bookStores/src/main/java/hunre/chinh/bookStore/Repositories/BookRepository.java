package hunre.chinh.bookStore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hunre.chinh.bookStore.Entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
