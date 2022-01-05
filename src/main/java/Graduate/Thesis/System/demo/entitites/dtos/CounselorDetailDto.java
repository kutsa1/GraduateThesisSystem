package Graduate.Thesis.System.demo.entitites.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CounselorDetailDto {
    private int id;
    private String name;
    private String lastName;
}
