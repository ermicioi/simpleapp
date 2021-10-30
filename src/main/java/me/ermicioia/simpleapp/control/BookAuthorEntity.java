package me.ermicioia.simpleapp.control;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book_author")
@Getter
@Setter
@ToString(callSuper = true)
public class BookAuthorEntity extends VersionedEntity {

    private String firstName;

    private String lastName;

}
