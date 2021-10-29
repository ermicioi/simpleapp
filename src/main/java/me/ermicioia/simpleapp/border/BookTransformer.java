package me.ermicioia.simpleapp.border;

import me.ermicioia.simpleapp.control.BookEntity;

import java.util.Collection;
import java.util.List;

public interface BookTransformer {

    List<BookDto> fromEntity(final Collection<BookEntity> entities);

}
