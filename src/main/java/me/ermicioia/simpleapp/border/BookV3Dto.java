package me.ermicioia.simpleapp.border;

import lombok.*;

import java.util.List;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class BookV3Dto {

    private final String title;
    private final List<String> authors;
    private final List<String> categories;

    @Builder
    private static BookV3Dto factory(
            @NonNull final String title,
            @NonNull final List<String> authors,
            @NonNull final List<String> categories) {
        return new BookV3Dto(title, authors, categories);
    }

}
