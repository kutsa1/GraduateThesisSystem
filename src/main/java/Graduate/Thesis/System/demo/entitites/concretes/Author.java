package Graduate.Thesis.System.demo.entitites.concretes;

import Graduate.Thesis.System.demo.core.entities.IEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(name = "authors")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Author implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotBlank
    @NotNull
    String name;

    @NotBlank
    @NotNull
    String lastName;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    @JsonIgnore
    List<Thesis> theses;
}
