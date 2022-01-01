package Graduate.Thesis.System.demo.entitites.concretes;

import Graduate.Thesis.System.demo.core.entities.IEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
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

    @OneToOne
    Language language;

    @OneToMany()
    @JsonIgnore
    List<SubjectTopic> subjectTopics;

    @OneToMany()
    @JsonIgnore
    List<Keyword> keywords;

    int thesisNo;

    String title;

    String summary;


    Date year;

    String type;

    int numberOfPages;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate deadline;

    @ManyToOne
    @JsonIgnore
    University university;

    @ManyToOne
    @JsonIgnore
    Institute institute;

    @ManyToOne
    @JsonIgnore
    Author author;

}
