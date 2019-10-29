package com.softwarecraftsmanship.mvc.factories;

import com.softwarecraftsmanship.mvc.dao.Idea;
import com.softwarecraftsmanship.mvc.dao.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class IdeaFactory {
    @Autowired
    IdeaRepository ideaRepository;

    public Idea getIdea(Long id) {
        Idea ideaObj = null;
        Date date = new Date();

        if (id != 0) {
            ideaObj = ideaRepository.findFirstById(id);
        }

        if (ideaObj == null){
            ideaObj = new Idea();
            ideaObj.setCreatedDate(date);
            ideaObj.setThumbsUpCount(0);
            ideaObj.setThumbsDownCount(0);
        }



        ideaObj.setModifiedDate(date);

        return ideaObj;
    }
}
