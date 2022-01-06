package Graduate.Thesis.System.demo.business.abstracts;

import Graduate.Thesis.System.demo.core.utilities.business.IServiceBase;
import Graduate.Thesis.System.demo.core.utilities.results.DataResult;
import Graduate.Thesis.System.demo.entitites.concretes.Counselor;
import Graduate.Thesis.System.demo.entitites.dtos.CounselorDetailDto;

import java.util.List;

public interface ICounselorService extends IServiceBase<Counselor> {

    DataResult<List<CounselorDetailDto>> getByTheses_id(int thesisId);
}
