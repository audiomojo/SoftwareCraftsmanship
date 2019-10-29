package com.softwarecraftsmanship.mvc.services;

import com.softwarecraftsmanship.mvc.dao.Idea;
import com.softwarecraftsmanship.mvc.dao.IdeaRepository;
import com.softwarecraftsmanship.mvc.factories.IdeaFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IdeaService {
    @Autowired
    IdeaFactory ideaFactory;

    @Autowired
    IdeaRepository ideaRepository;

    public Idea addEditIdea(String idea, String description, Long id) {
        Idea ideaObj = ideaFactory.getIdea(id);

        ideaObj.setIdea(idea);
        ideaObj.setDescription(description);
        ideaRepository.save(ideaObj);


        return ideaObj;
    }

    public List<Idea> getIdeas() {
        return ideaRepository.findAllBy();
    }

//    public List<Idea> getIdeasByScore() {
//        List<Idea> ideaList = getIdeas();
//        return ideaList.stream().sorted(Comparator.comparingInt((Idea::(getThumbsUpCount)+(Idea::(getThumbsDownCount)).reversed()).collect(Collectors.toList());
//    }

//    public Idea incrementScore(Long id) {
//        Idea idea = ideaRepository.findFirstById(id);
//
//        idea.setScore(idea.getScore()+1);
//        ideaRepository.save(idea);
//
//        return idea;
//    }
}
