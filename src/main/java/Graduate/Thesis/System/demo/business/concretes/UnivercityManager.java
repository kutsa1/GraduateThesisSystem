package Graduate.Thesis.System.demo.business.concretes;

import Graduate.Thesis.System.demo.business.abstracts.IUnivercityService;
import Graduate.Thesis.System.demo.business.tools.Messages;
import Graduate.Thesis.System.demo.core.utilities.results.DataResult;
import Graduate.Thesis.System.demo.core.utilities.results.IResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesDataResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesResult;
import Graduate.Thesis.System.demo.entitites.concretes.Univercity;
import Graduate.Thesis.System.demo.repo.abstracts.IUnivercityDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UnivercityManager implements IUnivercityService {
    private final IUnivercityDao iUnivercityDao;

    @Override
    public DataResult<List<Univercity>> getAll() {
        return new SuccesDataResult(iUnivercityDao.findAll(), Messages.univercityListed);
    }

    @Override
    public IResult add(Univercity univercity) {
        iUnivercityDao.save(univercity);
        return new SuccesResult(Messages.univercityAdd);
    }

    @Override
    public IResult update(Univercity univercity) {
        iUnivercityDao.save(univercity);
        return new SuccesResult(Messages.univercityUpdate);
    }

    @Override
    public IResult delete(Univercity univercity) {
        iUnivercityDao.delete(univercity);
        return new SuccesResult(Messages.univercityDelete);
    }

    @Override
    public DataResult<Univercity> getById(Integer id) {
        return new SuccesDataResult<>(iUnivercityDao.getById(id), Messages.univercityGetById);
    }
}
