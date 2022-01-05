package Graduate.Thesis.System.demo.business.concretes;

import Graduate.Thesis.System.demo.business.abstracts.IAuthorService;
import Graduate.Thesis.System.demo.business.tools.Messages;
import Graduate.Thesis.System.demo.core.utilities.results.*;
import Graduate.Thesis.System.demo.entitites.concretes.Author;
import Graduate.Thesis.System.demo.repo.abstracts.IAuthorDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class AuthorManager implements IAuthorService {
     private final IAuthorDao iAuthorDao;

    @Override
    public DataResult<List<Author>> getAll() {
        return new SuccesDataResult(iAuthorDao.findAll(), Messages.authorListed);

    }

    @Override
    public IResult add(Author author) {
        iAuthorDao.save(author);
        return new SuccesResult(Messages.authorSave);
    }

    @Override
    public IResult update(Author author) {
        iAuthorDao.save(author);
        return new SuccesResult(Messages.authorUpdate);
    }

    @Override
    public IResult delete(Author author) {
        iAuthorDao.delete(author);
        return new SuccesResult(Messages.authorDelete);
    }

    @Override
    public DataResult<Author> getById(Integer id) {
        return new SuccesDataResult<>(iAuthorDao.getById(id), Messages.authorGetById);
    }

    @Override
    public DataResult<Author> findByName(String authorName) {
        return new SuccesDataResult<>(iAuthorDao.findByName(authorName));
    }

    @Override
    public IResult existByAuthorId(int authorId) {
        if (iAuthorDao.existsById(authorId))
            return new SuccesResult(Messages.authorFound);
        return new ErrorResult(Messages.authorNotFound);

    }

}
