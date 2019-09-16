package com.softwarecraftsmanship.mvc.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Idea extends AbstractEntity {
    public String idea;
    public int score;
    public int thumbsUpCount;
    public int thumbsDownCount;
    public String description;
}
