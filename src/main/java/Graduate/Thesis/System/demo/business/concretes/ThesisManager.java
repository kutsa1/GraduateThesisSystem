package Graduate.Thesis.System.demo.business.concretes;

import Graduate.Thesis.System.demo.business.abstracts.IThesisService;
import Graduate.Thesis.System.demo.business.tools.Messages;
import Graduate.Thesis.System.demo.core.utilities.results.DataResult;
import Graduate.Thesis.System.demo.core.utilities.results.IResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesDataResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesResult;
import Graduate.Thesis.System.demo.entitites.concretes.Thesis;
import Graduate.Thesis.System.demo.repo.abstracts.IThesisDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ThesisManager implements IThesisService {
    private final IThesisDao iThesisDao;

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
}
