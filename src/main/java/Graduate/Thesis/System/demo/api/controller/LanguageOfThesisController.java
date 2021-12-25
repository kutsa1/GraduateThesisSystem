package Graduate.Thesis.System.demo.api.controller;

import Graduate.Thesis.System.demo.business.abstracts.ILanguageOfThesisService;
import Graduate.Thesis.System.demo.core.api.ControllerBase;
import Graduate.Thesis.System.demo.entitites.concretes.LanguageOfThesis;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/languages")
public class LanguageOfThesisController extends ControllerBase<LanguageOfThesis, ILanguageOfThesisService> {
    private final ILanguageOfThesisService iLanguageOfThesisService;

    public LanguageOfThesisController(ILanguageOfThesisService iLanguageOfThesisService) {
        super(iLanguageOfThesisService);
        this.iLanguageOfThesisService = iLanguageOfThesisService;
    }
}