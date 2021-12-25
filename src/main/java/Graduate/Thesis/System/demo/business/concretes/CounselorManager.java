package Graduate.Thesis.System.demo.business.concretes;

import Graduate.Thesis.System.demo.business.abstracts.ICounselorService;
import Graduate.Thesis.System.demo.business.tools.Messages;
import Graduate.Thesis.System.demo.core.utilities.results.DataResult;
import Graduate.Thesis.System.demo.core.utilities.results.IResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesDataResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesResult;
import Graduate.Thesis.System.demo.entitites.concretes.Counselor;
import Graduate.Thesis.System.demo.repo.abstracts.ICounselorDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CounselorManager implements ICounselorService {
    private final ICounselorDao iCounselorDao;

    @Override
    public DataResult<List<Counselor>> getAll() {
        return new SuccesDataResult(iCounselorDao.findAll(), Messages.counselorListed);
    }

    @Override
    public IResult add(Counselor counselor) {
        iCounselorDao.save(counselor);
        return new SuccesResult(Messages.counselorAdd);
    }

    @Override
    public IResult update(Counselor counselor) {
        iCounselorDao.save(counselor);
        return new SuccesResult(Messages.counselorUpdate);
    }

    @Override
    public IResult delete(Counselor counselor) {
        iCounselorDao.delete(counselor);
        return new SuccesResult(Messages.counselorDelete);
    }

    @Override
    public DataResult<Counselor> getById(Integer id) {
        return new SuccesDataResult<>(iCounselorDao.getById(id), Messages.counselorGetById);
    }
}
