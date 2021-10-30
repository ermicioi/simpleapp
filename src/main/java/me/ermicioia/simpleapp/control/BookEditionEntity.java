package me.ermicioia.simpleapp.control;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book_edition")
@Getter
@Setter
@ToString(callSuper = true)
public class BookEditionEntity extends VersionedEntity {

    private String isbn;

    @ManyToOne
    private BookEntity book;

    @OneToOne
    private BookPublisherEntity publisher;

}
