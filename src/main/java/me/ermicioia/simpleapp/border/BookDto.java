package me.ermicioia.simpleapp.border;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class BookDto {

    private final String title;

    @Builder
    private static BookDto factory(@NonNull final String title) {
        return new BookDto(title);
    }

}
