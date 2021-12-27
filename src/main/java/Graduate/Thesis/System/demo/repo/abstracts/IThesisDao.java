package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.Thesis;
import org.springframework.data.jpa.repository.JpaRepository;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IThesisDao extends JpaRepository<Thesis, Integer> {
    List<Thesis> findByLanguage_Name(String name);
    List<Thesis> findBySubjectTopics_Name(String name);
    List<Thesis> findByKeywords_Name(String name);
    List<Thesis> findByTitle(String title);
    List<Thesis> getByDeadline(LocalDate deadline);


}
