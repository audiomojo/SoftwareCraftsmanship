package com.softwarecraftsmanship.mvc.controllers;

import com.softwarecraftsmanship.mvc.dao.Idea;
import com.softwarecraftsmanship.mvc.services.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mvc")
public class IdeaController {
    @Autowired
    IdeaService ideaService;
    @RequestMapping("/addEditIdea")
    public Idea addEditIdea(@RequestParam(value = "idea") String idea,
                            @RequestParam(value = "score") int score,
                            @RequestParam(value = "thumbsUpCount") int thumbsUpCount,
                            @RequestParam(value = "thumbsDownCount") int thumbsDownCount,
                            @RequestParam(value = "description") String description,
                            @RequestParam(value = "id", defaultValue = "0") Long id) {

        return ideaService.addEditIdea(idea, score, thumbsUpCount, thumbsDownCount, description, id);
    }
}