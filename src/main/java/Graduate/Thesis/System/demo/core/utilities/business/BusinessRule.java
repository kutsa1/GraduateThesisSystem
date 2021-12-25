package Graduate.Thesis.System.demo.core.utilities.business;

import Graduate.Thesis.System.demo.core.utilities.results.IResult;

public class BusinessRule {
    public static IResult run(IResult... logics) {
        for (var logic : logics) {
            if (!logic.isSuccess())
                return logic;
        }
        return null;
    }
}
