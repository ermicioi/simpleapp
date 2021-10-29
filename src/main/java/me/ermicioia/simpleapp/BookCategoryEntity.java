package me.ermicioia.simpleapp;

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
public class BookCategoryEntity extends AbstractEntity {
}
