package me.ermicioia.simpleapp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book_edition")
@Getter
@Setter
@ToString(callSuper = true)
public class BookEditionEntity extends AbstractEntity {

    private String isbn;

    @OneToOne
    private BookPublisherEntity publisher;

}
