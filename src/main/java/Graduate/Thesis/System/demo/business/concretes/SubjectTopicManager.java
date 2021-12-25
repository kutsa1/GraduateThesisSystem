package Graduate.Thesis.System.demo.business.concretes;

import Graduate.Thesis.System.demo.business.abstracts.ISubjectTopicService;
import Graduate.Thesis.System.demo.business.tools.Messages;
import Graduate.Thesis.System.demo.core.utilities.results.DataResult;
import Graduate.Thesis.System.demo.core.utilities.results.IResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesDataResult;
import Graduate.Thesis.System.demo.core.utilities.results.SuccesResult;
import Graduate.Thesis.System.demo.entitites.concretes.SubjectTopic;
import Graduate.Thesis.System.demo.repo.abstracts.ISubjectTopicDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectTopicManager implements ISubjectTopicService {
    private final ISubjectTopicDao iSubjectTopicDao;

    @Override
    public DataResult<List<SubjectTopic>> getAll() {
        return new SuccesDataResult(iSubjectTopicDao.findAll(), Messages.subjectListed);
    }

    @Override
    public IResult add(SubjectTopic subjectTopic) {
        iSubjectTopicDao.save(subjectTopic);
        return new SuccesResult(Messages.subjectAdd);
    }

    @Override
    public IResult update(SubjectTopic subjectTopic) {
        iSubjectTopicDao.save(subjectTopic);
        return new SuccesResult(Messages.subjectUpdate);
    }

    @Override
    public IResult delete(SubjectTopic subjectTopic) {
        iSubjectTopicDao.delete(subjectTopic);
        return new SuccesResult(Messages.subjectDelete);
    }

    @Override
    public DataResult<SubjectTopic> getById(Integer id) {
        return new SuccesDataResult<>(iSubjectTopicDao.getById(id), Messages.subjectGetById);
    }
}
