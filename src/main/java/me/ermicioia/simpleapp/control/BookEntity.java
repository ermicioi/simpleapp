package me.ermicioia.simpleapp.control;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
@Getter
@Setter
@ToString(callSuper = true)
public class BookEntity extends VersionedEntity {

    private String title;

    @ManyToMany
    @JoinTable(
            name = "book_category_map",
            joinColumns = @JoinColumn(name = "book_id", foreignKey = @ForeignKey(name = "fk_book_category_book_id")),
            inverseJoinColumns = @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "fk_book_category_category_id"))
    )
    private List<BookCategoryEntity> categories;

    @ManyToMany
    @JoinTable(
            name = "book_author_map",
            joinColumns = @JoinColumn(name = "book_id", foreignKey = @ForeignKey(name = "fk_book_author_book_id")),
            inverseJoinColumns = @JoinColumn(name = "author_id", foreignKey = @ForeignKey(name = "fk_book_author_author_id"))
    )
    private List<BookAuthorEntity> authors;

}
