package Graduate.Thesis.System.demo.business.concretes;

import Graduate.Thesis.System.demo.business.abstracts.IKeywordService;
import Graduate.Thesis.System.demo.business.tools.Messages;
import Graduate.Thesis.System.demo.core.utilities.results.DataResult;
import Graduate.Thesis.System.demo.core.utilities.results.IResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesDataResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesResult;
import Graduate.Thesis.System.demo.entitites.concretes.Keyword;
import Graduate.Thesis.System.demo.repo.abstracts.IKeywordDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class KeywordManager implements IKeywordService {
    private final IKeywordDao iKeywordDao;

    @Override
    public DataResult<List<Keyword>> getAll() {
        return new SuccesDataResult(iKeywordDao.findAll(), Messages.keywordListed);
    }

    @Override
    public IResult add(Keyword keyword) {
        iKeywordDao.save(keyword);
        return new SuccesResult(Messages.keywordAdd);
    }

    @Override
    public IResult update(Keyword keyword) {
        iKeywordDao.save(keyword);
        return new SuccesResult(Messages.keywordUpdate);
    }

    @Override
    public IResult delete(Keyword keyword) {
        iKeywordDao.delete(keyword);
        return new SuccesResult(Messages.keywordDelete);
    }

    @Override
    public DataResult<Keyword> getById(Integer id) {
        return new SuccesDataResult<>(iKeywordDao.getById(id), Messages.keywordGetById);
    }
}
