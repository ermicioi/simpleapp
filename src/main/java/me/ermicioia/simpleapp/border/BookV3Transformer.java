package me.ermicioia.simpleapp.border;

import me.ermicioia.simpleapp.control.BookEntity;

import java.util.Collection;
import java.util.List;

public interface BookV3Transformer {

    List<BookV3Dto> fromEntity(final Collection<BookEntity> entities);

}
