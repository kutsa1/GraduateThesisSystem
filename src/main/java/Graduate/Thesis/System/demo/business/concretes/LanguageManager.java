package Graduate.Thesis.System.demo.business.concretes;

import Graduate.Thesis.System.demo.business.abstracts.ILanguageService;
import Graduate.Thesis.System.demo.business.tools.Messages;
import Graduate.Thesis.System.demo.core.utilities.results.DataResult;
import Graduate.Thesis.System.demo.core.utilities.results.IResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesDataResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesResult;
import Graduate.Thesis.System.demo.entitites.concretes.Language;
import Graduate.Thesis.System.demo.repo.abstracts.ILanguageDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class LanguageManager implements ILanguageService {
    private final ILanguageDao iLanguageDao;

    @Override
    public DataResult<List<Language>> getAll() {
        return new SuccesDataResult(iLanguageDao.findAll(), Messages.languagesListed);
    }

    @Override
    public IResult add(Language language) {
        iLanguageDao.save(language);
        return new SuccesResult(Messages.languageAdd);
    }


    @Override
    public IResult update(Language language) {
        iLanguageDao.save(language);
        return new SuccesResult(Messages.languageUpdate);
    }

    @Override
    public IResult delete(Language language) {
        iLanguageDao.delete(language);
        return new SuccesResult(Messages.languageDelete);
    }

    @Override
    public DataResult<Language> getById(Integer id) {
        return new SuccesDataResult<>(iLanguageDao.getById(id), Messages.languageGetById);
    }
}
