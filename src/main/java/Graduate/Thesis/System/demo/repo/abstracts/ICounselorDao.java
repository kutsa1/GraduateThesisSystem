package Graduate.Thesis.System.demo.repo.abstracts;

import Graduate.Thesis.System.demo.entitites.concretes.Author;
import Graduate.Thesis.System.demo.entitites.concretes.Counselor;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICounselorDao extends JpaRepository<Counselor, Integer> {


    @EntityGraph(value = "Thesis.detail", type = EntityGraph.EntityGraphType.LOAD)
    List<Counselor> getById(int id);

}
