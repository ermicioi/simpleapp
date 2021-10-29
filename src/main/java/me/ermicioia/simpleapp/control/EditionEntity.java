package me.ermicioia.simpleapp.control;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "edition")
@Getter
@Setter
@ToString(callSuper = true)
public class EditionEntity extends AbstractEntity {

    private String isbn;

    @ManyToOne
    private BookEntity book;

    @OneToOne
    private PublisherEntity publisher;

}
