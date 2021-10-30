package me.ermicioia.simpleapp.border;

import me.ermicioia.simpleapp.control.BookAuthorEntity;

import java.util.List;

public interface BookAuthorTransformer {

    List<BookAuthorDto> fromEntity(final List<BookAuthorEntity> authors);

    BookAuthorEntity fromDto(final BookAuthorDto dto);

}
