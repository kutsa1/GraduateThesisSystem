package Graduate.Thesis.System.demo.entitites.concretes;

import Graduate.Thesis.System.demo.core.entities.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "theses")
public class Thesis implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @OneToOne
    LanguageOfThesis languageOfThesis;

    @OneToMany()
    List<SubjectTopic> subjectTopics;

    @OneToMany()
    List<Keyword> keywords;
    int thesisNo;

    String title;

    String summary;

    Date year;

    String type;

    int numberOfPages;

    Date deadline;

}
