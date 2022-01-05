package Graduate.Thesis.System.demo.entitites.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThesisDetailDto {
    private int id;
    private String language;
    private String university;
    private String institute;
    private String author;
    private int thesisNo;
    private String title;
    private Date submissionDate;
    private Date year;
}
