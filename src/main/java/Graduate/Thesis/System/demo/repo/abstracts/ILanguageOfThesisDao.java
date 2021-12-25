package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.LanguageOfThesis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILanguageOfThesisDao extends JpaRepository<LanguageOfThesis, Integer> {
}
