package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IKeywordDao extends JpaRepository<Keyword,Integer> {
}
