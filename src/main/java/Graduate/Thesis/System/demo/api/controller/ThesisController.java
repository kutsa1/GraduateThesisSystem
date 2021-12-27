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
    ResponseEntity<?> getByLanguage(@RequestParam String name) {
        var result = iThesisService.getByLanguage(name);
        if (result.isSuccess())
            return new ResponseEntity(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/addlanguagetothesis")
    ResponseEntity<?> addLanguageToThesis(@RequestParam int languageId, int thesisId) {
        var result = iThesisService.addLanguageToThesis(languageId, thesisId);
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
    ResponseEntity<?> getByKeyword(@RequestParam String name) {
        var result = iThesisService.getByKeyword(name);
        if (result.isSuccess())
            return new ResponseEntity(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getbytitle")
    ResponseEntity<?> getByTitle(@RequestParam String title) {
        var result = iThesisService.getByTitle(title);
        if (result.isSuccess())
            return new ResponseEntity(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getbydeadline")
    ResponseEntity<?> getByDeadline(@RequestParam LocalDate deadline) {
        var result = iThesisService.getByDeadlineLike(deadline);
        if (result.isSuccess())
            return new ResponseEntity(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }


    @GetMapping("/getbyuniversityid")
    ResponseEntity<?> getThesesByUniId(@RequestParam int universityId) {
        var result = iThesisService.getThesesByUniId(universityId);
        if (result.isSuccess())
            return new ResponseEntity(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getbyuniversityname")
    ResponseEntity<?> getThesesByUniName(@RequestParam String universityName) {
        var result = iThesisService.getThesesByUniName(universityName);
        if (result.isSuccess())
            return new ResponseEntity(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getbyinstituteid")
    ResponseEntity<?> getThesesByInstituteId(@RequestParam int instituteId) {
        var result = iThesisService.getThesesByInstituteId(instituteId);
        if (result.isSuccess())
            return new ResponseEntity<>(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);

    }

    @GetMapping("/getbyinstitutename")
    ResponseEntity<?> getThesesByInstituteName(@RequestParam String instituteName){
        var result = iThesisService.getThesesByInstituteName(instituteName);
        if (result.isSuccess())
            return new ResponseEntity<>(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getbyauthorid")
    ResponseEntity<?> getThesesByAuthorId(@RequestParam int authorId) {
        var result = iThesisService.getThesesByAuthorId(authorId);
        if (result.isSuccess())
            return new ResponseEntity<>(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getbyauthorname")
    ResponseEntity<?> getThesesByAuthorName(@RequestParam String authorName) {
        var result = iThesisService.getThesesByAuthorName(authorName);
        if (result.isSuccess())
            return new ResponseEntity<>(result, HttpStatus.OK);
        return new ResponseEntity<>(new ErrorResult(result.getMessage()), HttpStatus.BAD_REQUEST);

    }



}
