package Graduate.Thesis.System.demo.api.controller;

import Graduate.Thesis.System.demo.business.abstracts.ISubjectTopicService;
import Graduate.Thesis.System.demo.core.api.ControllerBase;
import Graduate.Thesis.System.demo.entitites.concretes.SubjectTopic;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/subjecttopics")
public class SubjectTopicController extends ControllerBase<SubjectTopic, ISubjectTopicService> {
    private ISubjectTopicService iSubjectTopicService;

    public SubjectTopicController(ISubjectTopicService iSubjectTopicService) {
        super(iSubjectTopicService);
        this.iSubjectTopicService = iSubjectTopicService;
    }
}
