package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILanguageDao extends JpaRepository<Language, Integer> {
}
