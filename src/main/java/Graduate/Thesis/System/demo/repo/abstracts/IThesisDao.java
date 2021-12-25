package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.Thesis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IThesisDao extends JpaRepository<Thesis, Integer> {
}
