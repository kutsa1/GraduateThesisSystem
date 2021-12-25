package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.Institute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInstituteDao extends JpaRepository<Institute, Integer> {
}
