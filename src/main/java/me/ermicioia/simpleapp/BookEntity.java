package me.ermicioia.simpleapp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "book")
@Getter
@Setter
@ToString(callSuper = true)
public class BookEntity extends VersionedEntity {

    @ManyToMany
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id", foreignKey = @ForeignKey(name = "fk_book_author_book_id")),
            inverseJoinColumns = @JoinColumn(name = "author_id", foreignKey = @ForeignKey(name = "fk_book_author_author_id"))
    )
    private Collection<AuthorEntity> authors;

}
