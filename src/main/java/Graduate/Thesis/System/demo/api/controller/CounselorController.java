package Graduate.Thesis.System.demo.api.controller;

import Graduate.Thesis.System.demo.business.abstracts.ICounselorService;
import Graduate.Thesis.System.demo.core.api.ControllerBase;
import Graduate.Thesis.System.demo.entitites.concretes.Counselor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/counselors")
public class CounselorController extends ControllerBase<Counselor, ICounselorService> {
    private final ICounselorService iCounselorService;

    public CounselorController(ICounselorService iCounselorService) {
        super(iCounselorService);
        this.iCounselorService = iCounselorService;
    }
}
