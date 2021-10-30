package me.ermicioia.simpleapp.border;

import lombok.*;

import java.util.List;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class BookV4Dto {

    private final String title;
    private final List<String> authors;
    private final List<String> categories;
    private final String publisher;

    @Builder
    private static BookV4Dto factory(
            @NonNull final String title,
            @NonNull final List<String> authors,
            @NonNull final List<String> categories,
            @NonNull final String publisher) {
        return new BookV4Dto(title, authors, categories, publisher);
    }

}
