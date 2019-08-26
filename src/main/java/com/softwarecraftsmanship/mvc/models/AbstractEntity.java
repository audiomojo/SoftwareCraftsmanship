package com.softwarecraftsmanship.mvc.models;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
public class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdDate;
    private Date modifiedDate;

    public int compareTo(AbstractEntity abstractEntity) {
        return getCreatedDate().compareTo(abstractEntity.getCreatedDate());
    }
}
