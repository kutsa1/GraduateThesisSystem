package Graduate.Thesis.System.demo.core.utilities.results;

public class Result extends IResult {
    public Result(boolean success, String message) {
        super(success, message);
    }

    public Result(boolean success) {
        super(success);
    }

}

