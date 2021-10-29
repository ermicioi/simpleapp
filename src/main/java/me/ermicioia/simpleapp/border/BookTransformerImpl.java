package me.ermicioia.simpleapp.border;

import me.ermicioia.simpleapp.control.BookEntity;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
class BookTransformerImpl implements BookTransformer {

    public List<BookDto> fromEntity(final Collection<BookEntity> entities) {
        return entities.stream()
                .map(e -> BookDto.builder()
                        .title(e.getTitle())
                        .build())
                .collect(Collectors.toList());
    }

}
