package me.ermicioia.simpleapp.border;

import com.google.common.collect.ImmutableList;
import me.ermicioia.simpleapp.control.BookCategoryEntity;
import me.ermicioia.simpleapp.control.BookEditionEntity;
import me.ermicioia.simpleapp.control.BookEntity;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
class BookV4TransformerImpl implements BookV4Transformer {
    @Override
    public List<BookV4Dto> fromEntity(Collection<BookEditionEntity> entities) {
        return entities.stream()
                .map(edition -> {
                    final BookEntity book = edition.getBook();

                    final ImmutableList<String> authors = book.getAuthors().stream()
                            .map(a -> String.format("%s %s", a.getFirstName(), a.getLastName()))
                            .collect(ImmutableList.toImmutableList());

                    final ImmutableList<String> categories = book.getCategories().stream()
                            .map(BookCategoryEntity::getName)
                            .collect(ImmutableList.toImmutableList());

                    return BookV4Dto.builder()
                            .title(book.getTitle())
                            .authors(authors)
                            .categories(categories)
                            .publisher(edition.getPublisher().getName())
                            .build();
                })
                .collect(Collectors.toList());
    }
}
