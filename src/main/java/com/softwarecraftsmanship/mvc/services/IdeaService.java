package com.softwarecraftsmanship.mvc.services;

import com.softwarecraftsmanship.mvc.dao.Idea;
import com.softwarecraftsmanship.mvc.dao.IdeaRepository;
import com.softwarecraftsmanship.mvc.factories.IdeaFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdeaService {
    @Autowired
    IdeaFactory ideaFactory;

    @Autowired
    IdeaRepository ideaRepository;

    public Idea addEditIdea(String idea, int score, int thumbsUpCount, int thumbsDownCount, String description, Long id) {
        Idea ideaObj = ideaFactory.getIdea(id);

        ideaObj.setIdea(idea);
        ideaObj.setScore(score);
        ideaObj.setThumbsUpCount(thumbsUpCount);
        ideaObj.setThumbsDownCount(thumbsDownCount);
        ideaObj.setDescription(description);

        ideaRepository.save(ideaObj);

        return ideaObj;
    }
}
