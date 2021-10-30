package me.ermicioia.simpleapp.border;

import lombok.*;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class BookDto {

    private final String title;

    @Builder
    private static BookDto factory(@NonNull final String title) {
        return new BookDto(title);
    }

}
