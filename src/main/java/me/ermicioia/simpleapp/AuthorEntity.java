package me.ermicioia.simpleapp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "author")
@Getter
@Setter
@ToString(callSuper = true)
public class AuthorEntity extends VersionedEntity {

    private String firstName;

    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private List<BookEntity> books;

}
