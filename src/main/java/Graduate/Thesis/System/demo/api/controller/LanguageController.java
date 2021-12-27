package Graduate.Thesis.System.demo.api.controller;

import Graduate.Thesis.System.demo.business.abstracts.ILanguageService;
import Graduate.Thesis.System.demo.core.api.ControllerBase;
import Graduate.Thesis.System.demo.entitites.concretes.Language;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/languages")
public class LanguageController extends ControllerBase<Language, ILanguageService> {
    private final ILanguageService iLanguageService;

    public LanguageController(ILanguageService iLanguageService) {
        super(iLanguageService);
        this.iLanguageService = iLanguageService;
    }
}