package me.ermicioia.simpleapp.border;

import com.google.common.collect.ImmutableList;
import me.ermicioia.simpleapp.control.BookAuthorEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class BookAuthorTransformerImpl implements BookAuthorTransformer {

    @Override
    public List<BookAuthorDto> fromEntity(List<BookAuthorEntity> authors) {
        return authors.stream()
                .map(author -> BookAuthorDto.builder()
                        .firstName(author.getFirstName())
                        .lastName(author.getLastName())
                        .build())
                .collect(ImmutableList.toImmutableList());
    }
}
