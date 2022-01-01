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

@Data
@Entity
@Table(name = "institutes")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Institute implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotBlank
    @NotNull
    String name;

    @JsonIgnore
    @OneToMany(mappedBy = "institute")
    List<Thesis> theses;

    @ManyToOne
    @JsonIgnore
    University university;

}
