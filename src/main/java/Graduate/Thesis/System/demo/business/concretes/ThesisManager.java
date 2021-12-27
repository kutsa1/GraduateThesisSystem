package Graduate.Thesis.System.demo.business.concretes;

import Graduate.Thesis.System.demo.business.abstracts.ILanguageService;
import Graduate.Thesis.System.demo.business.abstracts.IThesisService;
import Graduate.Thesis.System.demo.business.tools.Messages;
import Graduate.Thesis.System.demo.core.utilities.results.DataResult;
import Graduate.Thesis.System.demo.core.utilities.results.IResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesDataResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesResult;
import Graduate.Thesis.System.demo.entitites.concretes.Language;
import Graduate.Thesis.System.demo.entitites.concretes.Thesis;
import Graduate.Thesis.System.demo.repo.abstracts.IThesisDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ThesisManager implements IThesisService {
    private final IThesisDao iThesisDao;
    private final ILanguageService iLanguageService;


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
        iThesisDao.save(thesis);
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
    public DataResult<List<Thesis>> getBySubject(String name) {
        var result = iThesisDao.findBySubjectTopics_Name(name);
        return new SuccesDataResult<>(result, Messages.thesisByLanguage);
    }

    @Override
    public DataResult<List<Thesis>> getByKeyword(String name) {
        var result = iThesisDao.findByKeywords_Name(name);
        return new SuccesDataResult<>(result,Messages.thesisByKeyword);
    }

    @Override
    public DataResult<List<Thesis>> getByTitle(String title) {
        var result = iThesisDao.findByTitle(title);
        return new SuccesDataResult<>(result, Messages.thesisByTitle);
    }

    @Override
    public DataResult<List<Thesis>> getByDeadlineLike(LocalDate deadline) {
        var result = iThesisDao.getByDeadline(deadline);
        return new SuccesDataResult<>(result, Messages.thesisByDeadline);
    }

}
