package me.ermicioia.simpleapp.border;

import com.google.common.collect.ImmutableList;
import me.ermicioia.simpleapp.control.BookEntity;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookV2TransformerImpl implements BookV2Transformer {
    @Override
    public List<BookV2Dto> fromEntity(Collection<BookEntity> entities) {
        return entities.stream()
                .map(e -> {
                    final ImmutableList<String> authors = e.getAuthors().stream()
                            .map(a -> String.format("%s %s", a.getFirstName(), a.getLastName()))
                            .collect(ImmutableList.toImmutableList());

                    return BookV2Dto.builder()
                            .title(e.getTitle())
                            .authors(authors)
                            .build();
                })
                .collect(Collectors.toList());
    }
}
