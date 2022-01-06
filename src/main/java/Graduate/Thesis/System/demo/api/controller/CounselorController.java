package Graduate.Thesis.System.demo.api.controller;

import Graduate.Thesis.System.demo.business.abstracts.ICounselorService;
import Graduate.Thesis.System.demo.core.api.ControllerBase;
import Graduate.Thesis.System.demo.entitites.concretes.Counselor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/counselors")
public class CounselorController extends ControllerBase<Counselor, ICounselorService> {
    private final ICounselorService iCounselorService;

    public CounselorController(ICounselorService iCounselorService) {
        super(iCounselorService);
        this.iCounselorService = iCounselorService;
    }

    @GetMapping("/getbythesisid")
    ResponseEntity<?> getByTheses_id(@RequestParam int thesisId) {
        var result = iCounselorService.getByTheses_id(thesisId);
        if (result.isSuccess())
            return new ResponseEntity<>(result, HttpStatus.OK);
        return new ResponseEntity<>(result.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
