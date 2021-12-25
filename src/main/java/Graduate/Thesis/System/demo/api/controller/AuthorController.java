package Graduate.Thesis.System.demo.api.controller;

import Graduate.Thesis.System.demo.business.abstracts.IAuthorService;
import Graduate.Thesis.System.demo.core.api.ControllerBase;
import Graduate.Thesis.System.demo.entitites.concretes.Author;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/authors")
public class AuthorController extends ControllerBase<Author, IAuthorService> {
    private final IAuthorService iAuthorService;

    public AuthorController(IAuthorService iAuthorService) {
        super(iAuthorService);
        this.iAuthorService = iAuthorService;
    }
}
