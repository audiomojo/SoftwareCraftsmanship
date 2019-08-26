package com.softwarecraftsmanship.mvc.models;

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
public class MVCModel extends AbstractEntity{

}
