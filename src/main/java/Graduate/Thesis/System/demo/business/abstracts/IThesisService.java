package Graduate.Thesis.System.demo.business.abstracts;

import Graduate.Thesis.System.demo.core.utilities.business.IServiceBase;
import Graduate.Thesis.System.demo.core.utilities.results.DataResult;
import Graduate.Thesis.System.demo.core.utilities.results.IResult;
import Graduate.Thesis.System.demo.entitites.concretes.Thesis;
import Graduate.Thesis.System.demo.entitites.dtos.ThesisDetailDto;

import java.util.List;


public interface IThesisService extends IServiceBase<Thesis> {
    DataResult<List<Thesis>> getByLanguage(String name);

    IResult addLanguageToThesis(int languageId, int thesisId);

    IResult addCounselorToThesis(int counselorId, int thesisId);

    DataResult<List<Thesis>> getBySubject(String name);

    DataResult<List<Thesis>> getByKeyword(String name);

    DataResult<List<Thesis>> getByTitle(String title);


    DataResult<List<Thesis>> getThesesByUniId(int universityId);

    DataResult<List<Thesis>> getThesesByUniName(String universityName);

    DataResult<List<Thesis>> getThesesByInstituteId(int instituteId);

    DataResult<List<Thesis>> getThesesByInstituteName(String instituteName);

    DataResult<List<Thesis>> getThesesByAuthorId(int authorId);

    DataResult<List<Thesis>> getThesesByAuthorName(String authorName);

    DataResult<List<ThesisDetailDto>> getThesisDetailDto();


}
