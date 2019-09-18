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

        if (id != 0) {
            ideaObj = ideaRepository.findFirstById(id);
        }

        if (ideaObj == null){
            ideaObj = new Idea();
        }

        Date date = new Date();
        ideaObj.setCreatedDate(date);
        ideaObj.setModifiedDate(date);

        return ideaObj;
    }
}
