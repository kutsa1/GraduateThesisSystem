package Graduate.Thesis.System.demo.api.controller;

import Graduate.Thesis.System.demo.business.abstracts.IInstituteService;
import Graduate.Thesis.System.demo.core.api.ControllerBase;
import Graduate.Thesis.System.demo.entitites.concretes.Institute;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("api/institutes")
public class InstituteController extends ControllerBase<Institute, IInstituteService> {
    private final IInstituteService iInstituteService;

    public InstituteController(IInstituteService iInstituteService ) {
        super(iInstituteService);
        this.iInstituteService=iInstituteService;
    }
}
