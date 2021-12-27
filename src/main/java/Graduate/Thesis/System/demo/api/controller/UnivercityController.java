package Graduate.Thesis.System.demo.api.controller;

import Graduate.Thesis.System.demo.business.abstracts.IUnivercityService;
import Graduate.Thesis.System.demo.core.api.ControllerBase;
import Graduate.Thesis.System.demo.entitites.concretes.University;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/univercities")
public class UnivercityController extends ControllerBase<University, IUnivercityService> {
    private final IUnivercityService iUnivercityService;


    public UnivercityController(IUnivercityService iUnivercityService) {
        super(iUnivercityService);
        this.iUnivercityService = iUnivercityService;
    }
}
