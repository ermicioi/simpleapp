package me.ermicioia.simpleapp.control;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book_publisher")
@Getter
@Setter
@ToString(callSuper = true)
public class BookPublisherEntity extends VersionedEntity {

    private String name;

}
