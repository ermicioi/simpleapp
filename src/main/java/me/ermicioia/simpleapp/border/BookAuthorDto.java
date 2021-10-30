package me.ermicioia.simpleapp.border;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class BookAuthorDto {


    private final String firstName;
    private final String lastName;

    @Builder
    @JsonCreator
    @Validated
    private static BookAuthorDto create(
            @NonNull @NotBlank final String firstName,
            @NonNull @NotBlank final String lastName) {
        return new BookAuthorDto(firstName, lastName);
    }

}
