package me.ermicioia.simpleapp.border;

import com.google.common.collect.ImmutableList;
import me.ermicioia.simpleapp.control.BookCategoryEntity;
import me.ermicioia.simpleapp.control.BookEntity;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
class BookV3TransformerImpl implements BookV3Transformer {
    @Override
    public List<BookV3Dto> fromEntity(Collection<BookEntity> entities) {

        return entities.stream()
                .map(e -> {
                    final ImmutableList<String> authors = e.getAuthors().stream()
                            .map(a -> String.format("%s %s", a.getFirstName(), a.getLastName()))
                            .collect(ImmutableList.toImmutableList());

                    final ImmutableList<String> categories = e.getCategories().stream()
                            .map(BookCategoryEntity::getName)
                            .collect(ImmutableList.toImmutableList());

                    return BookV3Dto.builder()
                            .title(e.getTitle())
                            .authors(authors)
                            .categories(categories)
                            .build();
                })
                .collect(Collectors.toList());
    }
}
