package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.Univercity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUnivercityDao extends JpaRepository <Univercity, Integer>{
}
