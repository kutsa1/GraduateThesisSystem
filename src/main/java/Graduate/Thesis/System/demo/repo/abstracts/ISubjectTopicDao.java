package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.SubjectTopic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubjectTopicDao extends JpaRepository<SubjectTopic, Integer> {
}
