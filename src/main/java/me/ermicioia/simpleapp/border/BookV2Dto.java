package me.ermicioia.simpleapp.border;

import lombok.*;

import java.util.List;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class BookV2Dto {

    private final String title;
    private final List<String> authors;

    @Builder
    private static BookV2Dto factory(
            @NonNull final String title,
            @NonNull final List<String> authors) {
        return new BookV2Dto(title, authors);
    }

}
