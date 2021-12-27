package Graduate.Thesis.System.demo.business.abstracts;

import Graduate.Thesis.System.demo.core.utilities.business.IServiceBase;
import Graduate.Thesis.System.demo.core.utilities.results.DataResult;
import Graduate.Thesis.System.demo.entitites.concretes.Institute;

import java.util.List;

public interface IInstituteService extends IServiceBase<Institute> {

    DataResult<List<Institute>> getByUniversityId(int universityId);

    DataResult<List<Institute>> getByUniversityName(String universityName);
}
