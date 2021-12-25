package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthorDao extends JpaRepository<Author, Integer> {

}
