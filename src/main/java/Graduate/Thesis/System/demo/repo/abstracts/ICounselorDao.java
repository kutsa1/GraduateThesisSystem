package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.Counselor;
import Graduate.Thesis.System.demo.entitites.dtos.CounselorDetailDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICounselorDao extends JpaRepository<Counselor, Integer> {


    @Query("select new Graduate.Thesis.System.demo.entitites.dtos.CounselorDetailDto(c.id,c.name,c.lastName) from Thesis t join t.counselors c where t.id=:thesisId")
    List<CounselorDetailDto> getByTheses_id(int thesisId);

}