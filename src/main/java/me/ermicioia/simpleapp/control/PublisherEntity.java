package me.ermicioia.simpleapp.control;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "publisher")
@Getter
@Setter
@ToString(callSuper = true)
public class PublisherEntity extends AbstractEntity {

    private String name;

}
