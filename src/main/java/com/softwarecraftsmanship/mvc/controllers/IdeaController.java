package com.softwarecraftsmanship.mvc.controllers;

import com.softwarecraftsmanship.mvc.dao.Idea;
import com.softwarecraftsmanship.mvc.services.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mvc")
public class IdeaController {
    @Autowired
    IdeaService ideaService;
    @RequestMapping("/addEditIdea")
    public Idea addEditIdea(@RequestParam(value = "idea") String idea,
                            @RequestParam(value = "description") String description,
                            @RequestParam(value = "id", defaultValue = "0") Long id) {

        return ideaService.addEditIdea(idea, description, id);
    }

    @RequestMapping("/getIdeas")
    public List<Idea> getIdeas(){
        return ideaService.getIdeas();
    }

//    @RequestMapping("/getIdeasByScore")
//    public List<Idea> getIdeasByScore(){
//        return ideaService.getIdeasByScore();
//    }
//
//    @RequestMapping("incrementScore")
//    public Idea incrementScore(@RequestParam(value = "id") Long id) {
//        return ideaService.incrementScore(id);
//    }
}
