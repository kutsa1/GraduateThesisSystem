package Graduate.Thesis.System.demo.api.controller;

import Graduate.Thesis.System.demo.business.abstracts.IInstituteService;
import Graduate.Thesis.System.demo.core.api.ControllerBase;
import Graduate.Thesis.System.demo.core.utilities.results.ErrorResult;
import Graduate.Thesis.System.demo.entitites.concretes.Institute;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@RequestMapping("api/institutes")
public class InstituteController extends ControllerBase<Institute, IInstituteService> {
    private final IInstituteService iInstituteService;

    public InstituteController(IInstituteService iInstituteService ) {
        super(iInstituteService);
        this.iInstituteService=iInstituteService;
    }

    @GetMapping("/getbyuniversityid")
    ResponseEntity<?> getByUniversityId(@RequestParam int universityId) {
        var result = iInstituteService.getByUniversityId(universityId);
        if (result.isSuccess())
            return new ResponseEntity(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getbyuniversityname")
    ResponseEntity<?> getByUniversityName(@RequestParam String universityName){
        var result = iInstituteService.getByUniversityName(universityName);
        if (result.isSuccess())
            return new ResponseEntity<>(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }

}
