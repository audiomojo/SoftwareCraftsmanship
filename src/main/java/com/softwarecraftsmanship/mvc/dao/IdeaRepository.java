package com.softwarecraftsmanship.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface IdeaRepository extends JpaRepository<Idea, Long> {
    Idea findFirstById(Long id);
    List<Idea> findAllBy();
    Idea findFirstByCreatedDate(Date data);
    Idea findFirstByOrderByScoreDesc();
}
