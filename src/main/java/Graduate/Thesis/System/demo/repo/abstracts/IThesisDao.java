package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.Counselor;
import Graduate.Thesis.System.demo.entitites.concretes.Thesis;
import Graduate.Thesis.System.demo.entitites.dtos.ThesisDetailDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IThesisDao extends JpaRepository<Thesis, Integer> {
    List<Thesis> findByLanguage_Name(String name);

    List<Thesis> findBySubjectTopics_Name(String name);

    List<Thesis> findByKeywords_Name(String name);

    List<Thesis> findByTitle(String title);

    List<Thesis> getByDeadline(LocalDate deadline);

    List<Thesis> getByUniversity_Id(int universityId);

    List<Thesis> getByUniversity_Name(String universityName);

    List<Thesis> getThesisByInstitute_Id(int instituteId);

    List<Thesis> getThesisByInstitute_Name(String instituteName);

    List<Thesis> getByAuthor_Id(int authorId);

    List<Thesis> getByAuthor_Name(String authorName);

    @Query(" select new Graduate.Thesis.System.demo.entitites.dtos.ThesisDetailDto(t.id,l.name,u.name,i.name,a.name,t.thesisNo,t.title,t.deadline) from Thesis t join t.language l join t.university u join t.institute i join t.author a")
    List<ThesisDetailDto> getThesisDetailDto();

    @Query(value = "select c.name,c.lastName,c.id from Thesis t inner join t.counselors c where t.id=: thesisId", nativeQuery = true)
    List<Counselor> getCounselorsOfThesis(int thesisId);

}
