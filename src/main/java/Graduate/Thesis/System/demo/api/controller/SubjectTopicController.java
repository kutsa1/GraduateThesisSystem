package Graduate.Thesis.System.demo.api.controller;

import Graduate.Thesis.System.demo.business.abstracts.ISubjectTopicService;
import Graduate.Thesis.System.demo.core.api.ControllerBase;
import Graduate.Thesis.System.demo.entitites.concretes.SubjectTopic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/subjecttopics")
public class SubjectTopicController extends ControllerBase<SubjectTopic, ISubjectTopicService> {
    private final ISubjectTopicService iSubjectTopicService;

    public SubjectTopicController(ISubjectTopicService iSubjectTopicService) {
        super(iSubjectTopicService);
        this.iSubjectTopicService = iSubjectTopicService;
    }
}
