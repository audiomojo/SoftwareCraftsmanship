package com.softwarecraftsmanship.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IdeaRepository extends JpaRepository<Idea, Long> {
    Idea findFirstById(Long id);
}
