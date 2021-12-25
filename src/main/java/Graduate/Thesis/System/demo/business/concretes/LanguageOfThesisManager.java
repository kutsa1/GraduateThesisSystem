package Graduate.Thesis.System.demo.business.concretes;

import Graduate.Thesis.System.demo.business.abstracts.ILanguageOfThesisService;
import Graduate.Thesis.System.demo.business.tools.Messages;
import Graduate.Thesis.System.demo.core.utilities.results.DataResult;
import Graduate.Thesis.System.demo.core.utilities.results.IResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesDataResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesResult;
import Graduate.Thesis.System.demo.entitites.concretes.LanguageOfThesis;
import Graduate.Thesis.System.demo.repo.abstracts.ILanguageOfThesisDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LanguageOfThesisManager implements ILanguageOfThesisService {
    private final ILanguageOfThesisDao iLanguageOfThesisDao;

    @Override
    public DataResult<List<LanguageOfThesis>> getAll() {
        return new SuccesDataResult(iLanguageOfThesisDao.findAll(), Messages.languagesListed);
    }

    @Override
    public IResult add(LanguageOfThesis languageOfThesis) {
        iLanguageOfThesisDao.save(languageOfThesis);
        return new SuccesResult(Messages.languageAdd);
    }


    @Override
    public IResult update(LanguageOfThesis languageOfThesis) {
        iLanguageOfThesisDao.save(languageOfThesis);
        return new SuccesResult(Messages.languageUpdate);
    }

    @Override
    public IResult delete(LanguageOfThesis languageOfThesis) {
        iLanguageOfThesisDao.delete(languageOfThesis);
        return new SuccesResult(Messages.languageDelete);
    }

    @Override
    public DataResult<LanguageOfThesis> getById(Integer id) {
        return new SuccesDataResult<>(iLanguageOfThesisDao.getById(id), Messages.languageGetById);
    }
}
