package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.Counselor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICounselorDao extends JpaRepository<Counselor, Integer> {
}
