package Graduate.Thesis.System.demo.business.concretes;

import Graduate.Thesis.System.demo.business.abstracts.ICounselorService;
import Graduate.Thesis.System.demo.business.abstracts.ILanguageService;
import Graduate.Thesis.System.demo.business.abstracts.IThesisService;
import Graduate.Thesis.System.demo.business.tools.Messages;
import Graduate.Thesis.System.demo.core.utilities.business.BusinessRule;
import Graduate.Thesis.System.demo.core.utilities.results.*;
import Graduate.Thesis.System.demo.entitites.concretes.Counselor;
import Graduate.Thesis.System.demo.entitites.concretes.Language;
import Graduate.Thesis.System.demo.entitites.concretes.Thesis;
import Graduate.Thesis.System.demo.entitites.dtos.ThesisDetailDto;
import Graduate.Thesis.System.demo.repo.abstracts.IThesisDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor
public class ThesisManager implements IThesisService {
    private final IThesisDao iThesisDao;
    private final ILanguageService iLanguageService;
    private final ICounselorService iCounselorService;


    @Override
    public DataResult<List<Thesis>> getAll() {
        return new SuccesDataResult<>(iThesisDao.findAll(), Messages.thesisListed);
    }

    @Override
    public IResult add(Thesis thesis) {
        iThesisDao.save(thesis);
        return new SuccesResult(Messages.thesisAdd);

    }

    @Override
    public IResult update(Thesis thesis) {
        iThesisDao.saveAndFlush(thesis);
        return new SuccesResult(Messages.thesisUpdate);
    }

    @Override
    public IResult delete(Thesis thesis) {
        iThesisDao.delete(thesis);
        return new SuccesResult(Messages.thesisDelete);
    }

    @Override
    public DataResult<Thesis> getById(Integer id) {
        return new SuccesDataResult<>(iThesisDao.getById(id), Messages.thesisGetById);
    }


    @Override
    public DataResult<List<Thesis>> getByLanguage(String name) {
        var result = iThesisDao.findByLanguage_Name(name);
        return new SuccesDataResult<>(result, Messages.thesisByLanguage);
    }

    @Override
    public IResult addLanguageToThesis(int languageId, int thesisId) {
        Thesis thesis = iThesisDao.getById(thesisId);
        Language language = iLanguageService.getById(languageId).getData();

        thesis.setLanguage(language);
        iThesisDao.save(thesis);
        return new SuccesResult(Messages.languageAdd);

    }

    @Override
    public IResult addCounselorToThesis(int counselorId, int thesisId) {

        var result = BusinessRule.run(
                getCountOfCounselor(thesisId)
        );
        if (result != null)
            return result;

        Thesis thesis = iThesisDao.getById(counselorId);
        Counselor counselor = iCounselorService.getById(counselorId).getData();

        thesis.getCounselors().add(counselor);
        iThesisDao.save(thesis);
        return new SuccesResult(Messages.counselorAdd);
    }

    @Override
    public DataResult<List<Thesis>> getBySubject(String name) {
        var result = iThesisDao.findBySubjectTopics_Name(name);
        return new SuccesDataResult<>(result, Messages.thesisByLanguage);
    }

    @Override
    public DataResult<List<Thesis>> getByKeyword(String name) {
        var result = iThesisDao.findByKeywords_Name(name);
        return new SuccesDataResult<>(result, Messages.thesisByKeyword);
    }

    @Override
    public DataResult<List<Thesis>> getByTitle(String title) {
        var result = iThesisDao.findByTitle(title);
        return new SuccesDataResult<>(result, Messages.thesisByTitle);
    }


    @Override
    public DataResult<List<Thesis>> getThesesByUniId(int universityId) {
        return new SuccesDataResult<>(iThesisDao.getByUniversity_Id(universityId));
    }

    @Override
    public DataResult<List<Thesis>> getThesesByUniName(String universityName) {
        return new SuccesDataResult<>(iThesisDao.getByUniversity_Name(universityName));
    }

    @Override
    public DataResult<List<Thesis>> getThesesByInstituteId(int instituteId) {
        return new SuccesDataResult<>(iThesisDao.getThesisByInstitute_Id(instituteId));
    }

    @Override
    public DataResult<List<Thesis>> getThesesByInstituteName(String instituteName) {
        return new SuccesDataResult<>(iThesisDao.getThesisByInstitute_Name(instituteName));
    }

    @Override
    public DataResult<List<Thesis>> getThesesByAuthorId(int authorId) {
        return new SuccesDataResult<>(iThesisDao.getByAuthor_Id(authorId));
    }

    @Override
    public DataResult<List<Thesis>> getThesesByAuthorName(String authorName) {
        return new SuccesDataResult<>(iThesisDao.getByAuthor_Name(authorName));
    }

    @Override
    public DataResult<List<ThesisDetailDto>> getThesisDetailDto() {
        return new SuccesDataResult<>(iThesisDao.getThesisDetailDto());
    }


    private IResult getCountOfCounselor(int thesisId) {
        var result = iThesisDao.getById(thesisId);
        if (result.getCounselors().size() >= 2) {
            return new ErrorResult(Messages.counselorCountNotValid);
        }
        return new SuccesResult();

    }

}
