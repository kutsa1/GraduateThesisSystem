package Graduate.Thesis.System.demo.api.controller;

import Graduate.Thesis.System.demo.business.abstracts.IThesisService;
import Graduate.Thesis.System.demo.core.api.ControllerBase;
import Graduate.Thesis.System.demo.entitites.concretes.Thesis;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ThesisController extends ControllerBase<Thesis, IThesisService> {
    private final IThesisService iThesisService;

    public ThesisController(IThesisService serviceBase, IThesisService iThesisService) {
        super(serviceBase);
        this.iThesisService = iThesisService;
    }
}
