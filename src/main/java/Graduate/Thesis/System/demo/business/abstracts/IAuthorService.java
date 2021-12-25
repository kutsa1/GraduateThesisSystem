package Graduate.Thesis.System.demo.business.abstracts;

import Graduate.Thesis.System.demo.core.utilities.business.IServiceBase;
import Graduate.Thesis.System.demo.core.utilities.results.DataResult;
import Graduate.Thesis.System.demo.core.utilities.results.IResult;
import Graduate.Thesis.System.demo.entitites.concretes.Author;

public interface IAuthorService extends IServiceBase<Author> {

    DataResult<Author> findByName(String authorName);

    IResult existByAuthorId(int authorId);
}
