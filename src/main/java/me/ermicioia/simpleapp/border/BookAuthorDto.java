package me.ermicioia.simpleapp.border;

import lombok.*;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class BookAuthorDto {

    private final String firstName;
    private final String lastName;

    @Builder
    private static BookAuthorDto create(
            @NonNull final String firstName,
            @NonNull final String lastName) {
        return new BookAuthorDto(firstName, lastName);
    }

}
