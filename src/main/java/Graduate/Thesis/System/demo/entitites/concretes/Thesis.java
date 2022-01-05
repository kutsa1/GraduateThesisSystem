package Graduate.Thesis.System.demo.entitites.concretes;

import Graduate.Thesis.System.demo.core.entities.IEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "theses")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Thesis implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int thesisNo;

    String title;

    String summary;

    Date year;

    String type;

    int numberOfPages;

    Date submissionDate;

    @ManyToOne()
    @NotNull
    Language language;

    @ManyToOne()
    @NotNull
    University university;

    @ManyToOne()
    @NotNull
    Institute institute;

    @ManyToOne()
    @NotNull
    Author author;

    @ManyToMany()
    @NotNull
    List<Keyword> keywords;

    @ManyToMany()
    @NotNull
    List<SubjectTopic> subjectTopics;

    @ManyToMany
    @NotNull
    List<Counselor> counselors;

}
