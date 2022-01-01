package Graduate.Thesis.System.demo.entitites.dtos;

import Graduate.Thesis.System.demo.entitites.concretes.Keyword;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

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
    private Date deadline;


}
