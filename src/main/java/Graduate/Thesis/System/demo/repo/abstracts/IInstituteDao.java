package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.Institute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IInstituteDao extends JpaRepository<Institute, Integer> {
    List<Institute> getByUniversity_Id(int universityId);

    List<Institute> getInstituteByUniversity_Name(String universityName);

}
