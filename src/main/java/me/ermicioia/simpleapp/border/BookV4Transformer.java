package me.ermicioia.simpleapp.border;

import me.ermicioia.simpleapp.control.BookEditionEntity;
import me.ermicioia.simpleapp.control.BookEntity;

import java.util.Collection;
import java.util.List;

public interface BookV4Transformer {

    List<BookV4Dto> fromEntity(final Collection<BookEditionEntity> entities);

}
