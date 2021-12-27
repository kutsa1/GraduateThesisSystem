package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUnivercityDao extends JpaRepository <University, Integer>{
}
