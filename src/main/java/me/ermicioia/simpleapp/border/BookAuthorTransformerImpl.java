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

    @Override
    public BookAuthorEntity fromDto(final BookAuthorDto dto) {
        return update(new BookAuthorEntity(), dto);
    }

    @Override
    public BookAuthorEntity update(final BookAuthorEntity entity, final BookAuthorDto dto) {
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        return entity;
    }
}
