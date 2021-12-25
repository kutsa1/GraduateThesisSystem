package Graduate.Thesis.System.demo.entitites.concretes;


import Graduate.Thesis.System.demo.core.entities.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "keywords")
@NoArgsConstructor
@AllArgsConstructor
public class Keyword implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

}
