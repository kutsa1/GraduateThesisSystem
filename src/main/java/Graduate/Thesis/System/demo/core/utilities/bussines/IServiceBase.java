package Graduate.Thesis.System.demo.core.utilities.bussines;

import Graduate.Thesis.System.demo.core.entities.IEntity;
import Graduate.Thesis.System.demo.core.utilities.results.DataResult;
import Graduate.Thesis.System.demo.core.utilities.results.IResult;

import java.util.List;

public interface IServiceBase<T extends IEntity> {
    DataResult<List<T>> getAll();

    IResult add(T t);

    IResult update(T t);

    IResult delete(T t);

    DataResult<T> getById(Integer id);

}