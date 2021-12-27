package Graduate.Thesis.System.demo.business.concretes;

import Graduate.Thesis.System.demo.business.abstracts.IInstituteService;
import Graduate.Thesis.System.demo.business.tools.Messages;
import Graduate.Thesis.System.demo.core.utilities.results.DataResult;
import Graduate.Thesis.System.demo.core.utilities.results.IResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesDataResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesResult;
import Graduate.Thesis.System.demo.entitites.concretes.Institute;
import Graduate.Thesis.System.demo.repo.abstracts.IInstituteDao;
import antlr.debug.MessageAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstituteManager implements IInstituteService {
    private final IInstituteDao iInstituteDao;

    @Override
    public DataResult<List<Institute>> getAll() {
        return new SuccesDataResult<>(iInstituteDao.findAll(), Messages.institutesListed);
    }

    @Override
    public IResult add(Institute institute) {
        iInstituteDao.save(institute);
        return new SuccesResult(Messages.instituteAdd);
    }

    @Override
    public IResult update(Institute institute) {
        iInstituteDao.save(institute);
        return new SuccesResult(Messages.instituteUpdate);
    }

    @Override
    public IResult delete(Institute institute) {
        iInstituteDao.delete(institute);
        return new SuccesResult(Messages.instituteDelete);
    }

    @Override
    public DataResult<Institute> getById(Integer id) {
        return new SuccesDataResult<>(iInstituteDao.getById(id), Messages.instituteGetById);
    }

    @Override
    public DataResult<List<Institute>> getByUniversityId(int universityId) {
        return new SuccesDataResult<>(iInstituteDao.getByUniversity_Id(universityId));
    }

    @Override
    public DataResult<List<Institute>> getByUniversityName(String universityName) {
        return new SuccesDataResult<>(iInstituteDao.getInstituteByUniversity_Name(universityName));
    }
}
