package Graduate.Thesis.System.demo.api.controller;

import Graduate.Thesis.System.demo.business.abstracts.IKeywordService;
import Graduate.Thesis.System.demo.core.api.ControllerBase;
import Graduate.Thesis.System.demo.entitites.concretes.Keyword;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/keywords")
public class KeywordController extends ControllerBase<Keyword, IKeywordService> {
    private final IKeywordService iKeywordService;

    public KeywordController(IKeywordService iKeywordService) {
        super(iKeywordService);
        this.iKeywordService=iKeywordService;
    }
}
