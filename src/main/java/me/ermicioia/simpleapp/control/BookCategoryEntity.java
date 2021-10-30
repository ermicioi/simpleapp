package me.ermicioia.simpleapp.control;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book_category")
@Getter
@Setter
@ToString(callSuper = true)
public class BookCategoryEntity extends VersionedEntity {

    private String name;

}
