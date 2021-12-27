package Graduate.Thesis.System.demo.api.controller;

import Graduate.Thesis.System.demo.business.abstracts.IThesisService;
import Graduate.Thesis.System.demo.core.api.ControllerBase;
import Graduate.Thesis.System.demo.core.utilities.results.ErrorResult;
import Graduate.Thesis.System.demo.entitites.concretes.Thesis;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("api/theses")
public class ThesisController extends ControllerBase<Thesis, IThesisService> {
    private final IThesisService iThesisService;

    public ThesisController(IThesisService serviceBase, IThesisService iThesisService) {
        super(serviceBase);
        this.iThesisService = iThesisService;
    }

    @GetMapping("/getbylanguage")
    ResponseEntity<?> getByLanguage(@RequestParam String name){
        var result = iThesisService.getByLanguage(name);
        if (result.isSuccess())
            return new ResponseEntity(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/addlanguagetothesis")
    ResponseEntity<?> addLanguageToThesis(@RequestParam int languageId, int thesisId){
        var result = iThesisService.addLanguageToThesis(languageId,thesisId);
        if (result.isSuccess())
            return new ResponseEntity(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getbysubject")
    ResponseEntity<?> getBySubject(@RequestParam String name) {
        var result = iThesisService.getBySubject(name);
        if (result.isSuccess())
            return new ResponseEntity(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getbykeyword")
    ResponseEntity<?> getByKeyword(@RequestParam String name){
        var result = iThesisService.getByKeyword(name);
        if (result.isSuccess())
            return new ResponseEntity(result,HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getbytitle")
    ResponseEntity<?> getByTitle(@RequestParam String title){
        var result = iThesisService.getByTitle(title);
        if (result.isSuccess())
            return new ResponseEntity(result,HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getbydeadline")
    ResponseEntity<?> getByDeadline(@RequestParam LocalDate deadline){
        var result = iThesisService.getByDeadlineLike(deadline);
        if (result.isSuccess())
            return new ResponseEntity(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }



}
